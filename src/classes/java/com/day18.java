/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;

import java.awt.BorderLayout;

/**
 *
 * @author IAmNotIntrovert
 */
public class day18 {
    public static void main(String args [])
    {
        person p1=new person();//defeault conctructor 
        person p2=new person(1,"ram","ktm");// paramaterize constructor 
        person p3=new person(p2);//copy cinstrictor 
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.setId(10);
        System.out.println(p2);
        p3.setAddress("bkt");
        System.out.println(p3.getId());
        System.out.println(p3.getAddress());
        
        
    
    }
    
}
