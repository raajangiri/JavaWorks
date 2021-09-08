/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;

public class Test1 {

    public static void main(String args[]) // declear 
    {

        int num1, num2, num3;
        JFrame frame = null;

        try {
            // imput 
            // process 
            // output
            frame = new JFrame();
            num1 = 9;
            num2 = 2;
            num3 = num1 / num2; // there may occur exception
            System.out.println(num3);
            frame.setTitle("First window");// here may also occut exception as it is not initilize

        } catch (ArithmeticException ex) {
            System.out.println("Error 1  " + ex);
            // or 

        } catch (NullPointerException ex) {
            System.out.println("Error  2 " + ex);
        } 
        catch(Exception ex){
        
            System.out.println("Error 3"+ex);
        }
                finally {

            System.out.println("Hello no error from finally ");
        }
    }

    // array out of bond exception
//      int nums[]=new int[5];
//      nums[0]=2;
//      nums[5]=3;
    // string out of bond exception 
//        String str="kathmandu";
//        System.out.println(str.charAt(20));
    //  compile time exception 
    // File f=new File("e:\\ cccc.txt");
//        System.out.print("Enter your age ");
//        int age=new Scanner(System.in).nextInt();
//        
//        System.out.println(age);
//        if(age>20&&age<=30)
//            System.out.println("welcome");
//        else 
//            System.out.println("age out of range");
}


