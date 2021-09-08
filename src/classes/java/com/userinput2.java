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
public class userinput2 {
    public static void main(String[]args)
     
    {
        int n1,n2,n3;
        float n4,n5,n6,n7,n8,n9;
        System.out.println("enter the frist number");
        n1=new Scanner(System.in).nextInt();
        System.out.println("enter the second  number");
        n2=new Scanner(System.in).nextInt();
        
        n3=n1+n2;
        n4=n1-n2;
        n5=n1/n2;
        n6=n1*n2;
        n7=n1%n2;
        n8=(float)Math.sqrt(n1);
        n9=(float)Math.pow(n1,n2);
        System.out.println("Sum is "+n3);
        System.out.println("difference is "+n4);
        System.out.println("dividence is "+n5);
        System.out.println("multiplication is "+n6);
        System.out.println("reminder is "+n7);
        System.out.println("square root is "+n8);
        System.out.println("power is "+n9);
        
        
                
        
    
    }
}
