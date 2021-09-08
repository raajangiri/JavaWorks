/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;

/**
 *
 * @author IAmNotIntrovert
 */
public class implict_and_explict_call {
      public static void main(String [] args)
    {
    byte bn=20;
    short sn=bn;
    double dn=sn;
    System.out.println("the value is"+dn);
    dn=1564654654.15646164;
    sn=(short)dn;
    bn=(byte)sn;
    System.out.println(bn);
    //wrapper class n 
    int n=10;
    Integer obj_in=new Integer(n);
    System.out.println(obj_in);
    String str="200";
    //int n2=str;
    int n2=Integer.parseInt(str);
    System.out.println(n2);
    
    }
    
}
