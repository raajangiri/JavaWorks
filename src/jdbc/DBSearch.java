package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import jdbc.Person;

public class DBSearch {
    String url="jdbc:mysql://localhost:3306/db_training";
    String user="admin";
    String pw="nepal123";
    int id=0;
    
    public void searchPerson(){
        try{
            System.out.println("Enter id : ");
            id=new Scanner(System.in).nextInt();
            
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            System.out.println("Connect database sucessfully");
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="SELECT * FROM tbl_person where id=?";
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, id);
            ResultSet rs=pstat.executeQuery(); //select
            System.out.println("ID\tNAME\t\tADDRESS");
            while(rs.next()==true){//if record in rs
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
            }
            System.out.println("Select and display record(s) sucessfully");
            conn.close();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
    
    public Person searchPerson(int id){
        Person person=new Person();
        try{
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="SELECT * FROM tbl_person where id=?";
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, id);
            ResultSet rs=pstat.executeQuery(); //select
            while(rs.next()==true){//if record in rs
              person =new Person(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            System.out.println("Select and display record(s) sucessfully");
            conn.close();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        return(person);
    }
    public static void main(String[] args) {
        new DBSearch();
    }
}