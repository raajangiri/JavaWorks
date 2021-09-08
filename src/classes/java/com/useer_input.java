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
public class useer_input {
    public static void main(String []args)
    {
      //declear 
        int num1,num2,num3;
        // input
        // prompt for user 
         System.out.print("Enter the first  number;");
         num1=new Scanner(System.in).nextInt();
         // process 
         System.out.print("Enter the second number2");
         num2=new Scanner(System.in).nextInt();
         //output2020
         num3=num1+num2;
         System.out.println("the value  of num 3 is "+num3);
    }
}
