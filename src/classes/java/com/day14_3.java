/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;
import java.util.Scanner;

// declear 1D array for five elements
public class day14_3 {
    public static void main(String args[])
    {
        int total=0;
        double average;
    int arr1[]=new int[5];
        System.out.println("Enter the five  values for input");
    for( int i=0;i<arr1.length;i++)
    {
     arr1[i]=new Scanner(System.in).nextInt();
    }
     for( int i=0;i<arr1.length;i++)
    {
        System.out.println("values "+arr1[i]);
    }
      for( int i=0;i<arr1.length;i++)
    {
        
         total+=arr1[i];
         
    }
     average =  total/arr1.length;
        System.out.println("avarage is "+average);
        System.out.println("total is "+total);
   
    
    }
    
}
