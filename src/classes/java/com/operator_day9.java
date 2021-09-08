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
public class operator_day9 {
    public static void main (String []args)
    {
    int in1,in2,in3,res1,res2,res3,res4;
    
        
    System.out.print("enter first number");
    in1=new Scanner(System.in).nextInt();
    System.out.print("enter second number");
    in2=new Scanner(System.in).nextInt();
    System.out.print(" enter thirs number");
    in3=new Scanner(System.in).nextInt();
    System.out.println(" first number"+in1);
    System.out.println(" second number"+in2);
    System.out.println(" third number number"+in3);
    res1=(in1>=in2)? in1:in2;
    res2=(in2>=in3)?in2:in3;
    System.out.println("largest value is"+res1);
    System.out.println("largest value is "+res2);
    //smaller
    res3=(in1<=in2)?in1:in2;
    res4=(in2<=in3)?in2:in3;
    System.out.println("smallest  value is "+res3);
    System.out.println("smallest  value is "+res4);
    
    }
    
}
