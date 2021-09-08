/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int choice = 0;
        do {
            System.out.println("1.Add new:");
            System.out.println("2.search:");
            System.out.println("3.display all:");
            System.out.println("4.update:");
            System.out.println("5.detlte:");
            System.out.println("0.exit :");
            System.out.println("Enter your choice (o> exit):");
            choice = new Scanner(System.in).nextInt();
            if(choice>=1 && choice<=5){
            switch (choice) {
                case 0:
                    break;
                case 1:
                    new DBInsert();
                    break;
                case 2:
                    new DBSearch();
                    break;
                case 3:
                    new DBSelect();
                    break;
                case 4:
                    new DBUpdate();
                    break;
                case 5:
                    new DBDelete();
                    break;

            }
            }
            else 
                System.out.println("invalid number");
        } while (choice != 0);
    }

}
