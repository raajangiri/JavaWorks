/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;

/**
 *
 * @author IAmNotIntrovert
 */
public class Day18_3 {
    public static void main(String args [])
            
    {
    Students s,s1,s2;
    s=new Students();
    System.out.println("..................");
    System.out.println(s);
    s1 =new Students (5,"ram","shyam",5,2);
    s1.SetMark1(500);
    s1.calculatetotal();
    s1.calculateavg();
    s1.checkpass();
     System.out.println("..................");
    System.out.println(s1);
    s1.processresult();
    System.out.println("..................");
    System.out.println(s1);
    
    
    
    
    }
    
}
