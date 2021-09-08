/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;
import java.util.Scanner;

// implict and explict call
public class day6 {
    public static void main(String [] args)
    {
   
        // Airthematic operation
        int n1,n2,n3,n4,n5,n6,n7,n8,n9;
        n1=10;
        n2=5;
        n3=n1+n2;
        n4=n1*n2;
        n5=n1%n2;
        n6=n1/n2;
        n7=n1-n2;
        n8=(int)Math.sqrt(25);
        n9=(int)Math.pow(3,2);
          
        System.out.println("addition is "+n3);
        System.out.println("multiplication is "+n4);
        System.out.println("modulus is"+n5);
        System.out.println("dividence is "+n6);
        System.out.println("subtraction is "+n7);
        System.out.println("square root is "+n8);
        System.out.println("power is "+n9);
        
        // short hand assinment operator
         int a=10;
         int b=5;
         int c=2;
         c+=a+b;
         System.out.println("the value od c is "+c);
     
    }
    
}
