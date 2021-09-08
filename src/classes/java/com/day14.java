
package classes.java.com;
 import java.util.Scanner;

public class day14 {
    static final int Max=5;
    public static void main (String args[])
    {
        
       // int numbs []=new int [5];
        
        int numbs[];
        numbs=new int[Max];
        numbs[0]=10;
        System.out.println(numbs[0]);
        int n=numbs.length;
        System.out.println(n);
               
        int marks[]={34,33,56,455,53,9};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        int n1=marks[4];
        System.out.println(n1);
        
        for( int i=0;i<marks.length;i++)
        {
        System.out.println( marks[i]);
        }
        
        
        
        
        
    
    }            
}
