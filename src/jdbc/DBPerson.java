/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class DBPerson {

    String url = "jdbc:mysql://localhost:3306/test";

    String user = "admin";
    String pw = "nepal123";

    public ArrayList<Person> allRecords() {

        ArrayList<Person> persons = new ArrayList<Person>();

        try {
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn = DriverManager.getConnection(url, user, pw);

            String sql = "select * from person";

            PreparedStatement pstat = conn.prepareStatement(sql);

            ResultSet rs = pstat.executeQuery();
            while (rs.next()) {
                Person tmp = new Person();

                tmp.setId(rs.getInt(1));
                tmp.setName(rs.getString(2));
                tmp.setAddress(rs.getString(3));
                persons.add(tmp);

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);

        }
        return (persons);
    }
}
