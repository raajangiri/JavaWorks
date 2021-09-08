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
public class day11 {
    public static void main(String args[])
    {
     /*int n1=2;
     if(n1==0)
     {
     System.out.println("Zero");
     }
     else if(n1==1)
     {
     System.out.println("one");
     }
     else if(n1==2)
     {
     System.out.println("two");
     }
     else
     {
     System.out.println("others");
     }
     
     //taking input  from the user and printing the days 
     int in;
     System.out.println("Enter the number from 1 -7:");
     in=new Scanner(System.in).nextInt();
     if(in==1)
     {
     System.out.print("Sunday");
     }
     else if(in==2)
      {
        System.out.print("monday");
      }
     else if(in==3)
      {
        System.out.print("tuesday");
      }
     else if(in==4)
      {
        System.out.print("wednesday");
      }
     else if(in==5)
      {
        System.out.print("thursday");
      }
     else if(in==6)
      {
        System.out.print("friday");
      }
     else if(in==7)
      {
        System.out.print("saturday");
      }
     else
     {
     System.out.println("number out of range");
     }
     //
     int in2,in3,in4;
     int large;
     System.out.println("enter first number");
     in2=new Scanner(System.in).nextInt();
     System.out.println("enter first number");
     in3=new Scanner(System.in).nextInt();
     System.out.println("enter first number");
     in4=new Scanner(System.in).nextInt();
     large=in2;
     if(in3>large)
     {
     if(in3>in4)
     {
      large=in3;
     }
     if(in4>large)
     {
     if(in4>in3)
     {
      large=in4;
     }
     
     }
     System.out.println("large is "+large);
     }
*/
     char ch;
     System.out.print("enter any character");
     ch=new Scanner(System.in).nextLine().charAt(0);
 
    switch(ch)
   {
       case 'a' :
       
       case 'e' :
       
       case 'i' :
       
       case 'o' :
     
       case 'u' :
           System.out.println("vowel");
           break;
       
   default :
       System.out.println("other");
               
                       
  
   }
   
    
    
    }
    
    
}
