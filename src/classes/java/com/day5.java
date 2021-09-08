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
public class day5 {
    public enum Season{SPRING, FAlL,SUMMER,WINTER};
   
   public static void main(String []args)
   {
        final int MAX=10;
       System.out.println("the value of max is "+MAX);
       //MAX=34;
       System.out.println("the updated value of max is "+MAX);
       //Enumeration (enum)it shobld be define before main class
       Season s;
       s=Season.SPRING;
        System.out.println("the value of enum is "+s);
        s=Season.FAlL;
         System.out.println("the value of enum 2 is "+s);
   }
    
    
}

