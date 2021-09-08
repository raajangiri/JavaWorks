/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import GuiPractise.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB_Person {
    
     String url="jdbc:mysql://localhost:3306/test";
                
        String user ="admin";
        String pw="nepal123";
    public boolean saveRecord(Person p){
           
    boolean res=false;
    
    try{
           Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="insert into tbl_person(id, address, playing,reading,gender,age_grp) values(?, ?, ?,?,?,?);";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, p.getId());
            pstat.setString(2, p.getAddress());
            pstat.setInt(3, p.getPlaying());
            pstat.setInt(4, p.getReading());
            pstat.setString(5, p.getGender());
            pstat.setString(6, p.getAge_grp());

            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Insert record sucessfully");
            conn.close();
            res=true;
        
    }
catch(Exception ex){
    System.out.println("error"+ex);
    }
    return(res);
    }
    
    public Person searchRecord(int id){
           
    Person p=new Person();
    
    try{
           Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="select * from tbl_person WHERE id=?";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1,id);
            ResultSet rs=pstat.executeQuery();
            while (rs.next())
            {
            p.setId(rs.getInt(1));
                p.setGender(rs.getString(2));
                p.setReading(rs.getInt(3));
                p.setPlaying(rs.getInt(4));
                p.setAge_grp(rs.getString(5));
                p.setAddress(rs.getString(6));
            }
//          
//
//            pstat.executeUpdate(); //insert, update, delete
//            System.out.println("Insert record sucessfully");
//            conn.close();
           // res=true;
        
    }
catch(Exception ex){
    System.out.println("error"+ex);
    
        
        
    }
    return(p);
    }

   

    
    
    
    
}
