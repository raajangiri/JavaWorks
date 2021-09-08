/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;
import java.util.Scanner;

/**
 *
 * @author IAmNotIntrovert
 */
public class day10 {
    //control flow statement 
    public static void main(String args[])
    {
     int n=10;
     if(n==0)
     {
     System.out.println("zero");
     }
     // taking input from user 
     
     System.out.print("Enter the number");
     int a=new Scanner(System.in).nextInt();
     if(a==1)
     {
         System.out.println("one");
     }
     if(a==2)
     {
         System.out.println("two");
     }
     if(a==3)
     {
         System.out.println("three");
     }
     if(a==4)
     {
         System.out.println("four");
     }
     if(a==5)
     {
         System.out.println("five");
     }
     if(a==6)
     {
         System.out.println("six");
     }
     if(a==7)
     {
         System.out.println("seven");
     }
     if(a==8)
     {
         System.out.println("eignt");
     }
     if(a==9)
     {
         System.out.println("nine");
     
         System.out.println("End");
         
     int age=18;
     if(age!=18)
     {
     System.out.println("Age is not 18");
     }
     double sub1=35;
     String result="Fail";
     if(sub1>=40)
     {
     result="pass";
     
     }
     System.out.println("result is "+result);
     
     
     int number=-10;
     if(number>0)
     {
     System.out.println("number is positive");
     }
     else
     {
     System.out.println("numbere is negative");
     }
     System.out.println("this statement is always executed");
    }

    }
    
}
