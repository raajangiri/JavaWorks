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
public class day16_2 {
    public static void main(String args [])
    {
        Students s1;
        
        s1=new Students();
        s1.id=12;
        s1.name="raajan";
        s1.grade="six";
        System.out.println(s1.id+"  "+s1.name+" "+s1.grade);
        // for subject 
        Subject s2;
        s2=new Subject();
        s2.id=25;
        s2.name="math";
        s2.pass_marks=25;
        System.out.println(s2.id+"  "+s2.name+" "+s2.pass_marks);
        
        
    }
    
}
