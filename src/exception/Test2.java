package exception;

import java.util.Scanner;

public class Test2 {

    public static void main(String args[]) {
        int age = 0;

        try {
            System.out.println("enter age(20-30)");
            age = new Scanner(System.in).nextInt();
            if((age<20)|| (age>30))
                throw new AgeException("please enter betn 20-30");// validation 
            System.out.println("Age" + age);
        } catch (Exception ex) {
            System.out.println("Error1" + ex);
        }

    }
}
