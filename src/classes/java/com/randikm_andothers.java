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
public class randikm_andothers {
    public static void main(String []args)
    {
        boolean res;
        res=false;
        res=true;
        byte b1,b2;
    double rn=Math.random();
    System.out.println("random number is "+rn*100);
    b1=10;
    b2=20;
    res=(b1==b2);
    System.out.println("this is "+res);
    //for character
    char ch1,ch2;
    ch1='a';
    ch2='a';
    res=ch1==ch2;
    System.out.println("character comapre is "+res);
    //boolean
    boolean r1,r2;
    r1=true;
    r2=false;
    res=r1==r2;
    System.out.println("boolean compare is "+res);
    //string 
    //for string == is not used 
    String str1,str2;
    str1="KAthmandu";
    str2="kathmandu";
    //password
    res=(str1.equals (str2));//case sensative 
    
    System.out.println("string compare is "+res);
    //user 
    res=str1.equalsIgnoreCase(str2);//case insentative 
    System.out.println("string compares is "+res);
    // not wquals to 
    byte by1=30,by2=20;
    res=(r1!=r2);
    System.out.println(res);
    // character and boolean 
    res=(ch1!=ch2);
    System.out.println(res);
    // greater and less than operaor 
    short s1,s2;
    s1=20;
    s2=40;
    res=(s1>s2);
    System.out.println("s1 is greater than s2  "+res);
    res=(s2<s1);
    System.out.println("s1 is greater than s2  "+res);
    // less than 
    res=(s1<s2);
    System.out.println("s1 is less than s2  "  +res);
    res=(s2<s1);
    System.out.println("s1 is less than s2 "  +res);
    // grater than or equals to 
    res=(s1>=s2);
    System.out.println("s1 rea"+res);
    res=(s2>=s2);
    System.out.println(res);
    //less than or equals to 
    res=(s1<=s2);
    System.out.println(res);
    res=(s2<=s1);
    System.out.println(res);
    //not operaor 
    System.out.println(res);
    System.out.println(!res);
    // conditional operator
    long a,b,c;
    a=25;
    b=45;
    c=(a>b)?b:a;
    System.out.println("it returns the value "+c);
    // class work
    int in1,in2;
    boolean res1,res2,res3,res4,res5,res6;
    System.out.print("enter fitst number");
    in1=new Scanner(System.in).nextInt();
    System.out.print("enter fitst number");
    in2=new Scanner(System.in).nextInt();
    res1=(in1==in2);
    res2=(in1!=in2);
    res3=(in1>in2);
    res4=(in1>=in2);
    res5=(in1<in2);
    res6=(in1<=in2);
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);
    System.out.println(res);
    
    }
}
