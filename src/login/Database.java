/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author IAmNotIntrovert
 */
public class Database {
     
       static String url="jdbc:mysql://localhost:3306/test";
                
       static  String user ="admin";
       static  String pw="nepal123";
       static Connection conn=null;
       
        public static Connection connect()
        {
              try{
        Class.forName("com.mysql.jdbc.Driver");
        
         conn=DriverManager.getConnection(url,user,pw);
//            System.out.println("connection successful");
//           
//            String sql="insert into tbl_person(id, name, address) values (6,'ram','bhaktapur')";
//            PreparedStatement pstat=conn.prepareStatement(sql);
//            pstat.executeUpdate();
//            System.out.println("insert succcessfully");
//            conn.close();
//            System.out.println("database close successfully ");
        } catch(Exception ex)
        {
        System.out.println("Error"+ex);
        }
              return(conn);
        }
        public static void close(Connection conn)
        {
        try{
        conn.close();
        
        }catch(Exception ex)
        {
            System.out.println("Error"+ex);
        }
        }
    
}
