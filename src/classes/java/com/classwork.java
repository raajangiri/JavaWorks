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
public class classwork {
    public static void main(String[]args)
    {
     double m1,m2,t1,av1;
     String res;
    System.out.print("enter marks of first number");
    m1=new Scanner(System.in).nextDouble();
    System.out.print("enter marks of second number");
    m2=new Scanner(System.in).nextDouble();
    System.out.println("marks first is "+m1);
    System.out.println("marks second is "+m2);
    t1=m1+m2;
    av1=(m1+m2)/2;
    res=(m1>=40)&&(m2>40)?"pass":"fail";
    System.out.println("total is "+t1);
    System.out.println("average is "+av1);
    System.out.println("result is"+res);
    
             
    }
    
}
