/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author IAmNotIntrovert
 */
public class DBLogin {
    public LoginInfo login(Login login)
    {
     LoginInfo login_info=new LoginInfo();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=Database.connect();
            String sql="SELECT * FROM tbl_login where login_name=? and login_password=?";
             PreparedStatement pstat=conn.prepareStatement(sql);
             pstat.setString(1, login.getLogin_name());
             pstat.setString(2, login.getLogin_password());
             ResultSet rs=pstat.executeQuery();
              login_info.setLogin(login);
            login_info.setMessage(new Message("false"));
             
             while(rs.next()==true){//if record in rs
              login_info.setLogin(login);
              login_info.setMessage( new Message("true"));
            }
           Database.close(conn);
           
       
        }
        catch(Exception ex){
            login_info.setLogin(login);
            login_info.setMessage(new Message("false"));
        }
        
        return(login_info);
    }
    
}
