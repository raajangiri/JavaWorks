
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBDelete {
    
    String url="jdbc:mysql://localhost:3306/db_training";
    String user="admin";
    String pw="nepal123";
    
    public void deletePerson(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            System.out.println("Enter id : ");
            int id=new Scanner(System.in).nextInt();
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="delete from tbl_person where id=?";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, id);
            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Delete record sucessfully");
            conn.close();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
    
    public boolean deletePerson(int id){
        boolean res=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            
            String sql="delete from tbl_person where id=?";
            
            //Inser, Update, Delete, Or Select
            
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, id);
            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Delete record sucessfully");
            conn.close();
            res=true;
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        return(res);
    }
    
    public static void main(String[] args) {
        
        new DBDelete();
        
    }
}
