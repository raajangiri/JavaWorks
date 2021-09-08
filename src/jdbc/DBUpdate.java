package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBUpdate {
    String url="jdbc:mysql://localhost:3306/db_training";
    String user="admin";
    String pw="nepal123";
    
    int id=0;
    String name="";
    String address="";
    
    public void updatePerson(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            id=new Scanner(System.in).nextInt();
            System.out.println("Enter name: ");
            name=new Scanner(System.in).nextLine();
            System.out.println("Enter address : ");
            address=new Scanner(System.in).nextLine();
            
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="update tbl_person set name=?, address=? where id=?";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setString(1, name);
            pstat.setString(2, address);
            pstat.setInt(3, id);
            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Update record sucessfully");
            conn.close();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
    
    public boolean updatePerson(Person p){
        boolean res=false;
        try{
           
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="update tbl_person set name=?, address=? where id=?";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setString(1, p.getName());
            pstat.setString(2, p.getAddress());
            pstat.setInt(3, p.getId());
            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Update record sucessfully");
            conn.close();
            res=true;
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        return(res);
    }
    
    public static void main(String[] args) {
        new DBUpdate();
    }
}