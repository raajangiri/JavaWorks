package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBInsert {
    
    String url="jdbc:mysql://localhost:3306/db_training";
    String user="admin";
    String pw="nepal123";
    
    int id=0;
    String name="";
    String address="";
    
    public DBInsert(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            
            System.out.println("Enter id : ");
            id=new Scanner(System.in).nextInt();
            System.out.println("Enter name: ");
            name=new Scanner(System.in).nextLine();
            System.out.println("Enter address : ");
            address=new Scanner(System.in).nextLine();
            
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="insert into tbl_person(id, name, address) values(?, ?, ?);";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, id);
            pstat.setString(2, name);
            pstat.setString(3, address);
            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Insert record sucessfully");
            conn.close();
            
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
    
    
    public DBInsert(int id, String name, String address){
        try{
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="insert into tbl_person(id, name, address) values(?, ?, ?);";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, id);
            pstat.setString(2, name);
            pstat.setString(3, address);
            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Insert record sucessfully");
            conn.close();
            
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
    
    
    public static void main(String[] args) {
        new DBInsert();
    }
}