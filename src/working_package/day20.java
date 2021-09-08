/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package working_package;

import java.awt.BorderLayout;
import oop.NewStudents;
import oop.FinalStudent;

/**
 *
 * @author IAmNotIntrovert
 */
public class day20 {

    public static void main(String args[]) {
//        NewStudents s1 = new NewStudents(1, "name");
//        FinalStudent fs=new FinalStudent(5,"raajan" ,"bit","A");
//        //System.out.println(s1);
//        System.out.println(fs);
//        s1.setID(2);
//        s1.setName("raajan");
//        System.out.println(s1);
//        s1.id = 10;
//        s1.name = "raajan giri";
//        System.out.println(s1);
      FinalStudent fs=new FinalStudent(2,"raajan"," bit","A");
      System.out.println(fs);
      FinalStudent fs1=new FinalStudent();
      System.out.println(fs1);
       fs1.setID(25);
       fs1.setName(" Aplle");
       System.out.println(fs1);
       FinalStudent fs2=new FinalStudent(fs);
        System.out.println(fs2);
       
       
      

      
    }

}
