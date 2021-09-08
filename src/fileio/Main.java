/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.File;
import java.io.IOException;

public class Main {

    //public static void main(String args []){
//    File dirl =new File("E://MyFiles//Folder1");
//    File fil =new File("E://MyFiles//Folder2");
//    dirl.mkdir();
//    fil.mkdir();
//    boolean res=dirl.mkdir();
//    if(res){
//        System.out.println("folder create successfully");
//            
//    }
//    else
//        System.out.println("unable to create folder ");
// }}    
// 
    /* public static void main(String args[]) throws IOException {
        File file1 = new File("E:\\Myfiles\\Folder1\\info.txt");
        if (file1.exists() == true) {
            System.out.println("file already exists");
        } else {
            file1.createNewFile();
            System.out.println("file created succ");
        }
    } */
    public static void main(String args[]) {
        File file = new File("C:\\Windows");
        String[] files = file.list();
        System.out.println(files.length);
        for (int i = 0; i < files.length; i++) {
            String str = "";
            File f = new File("C:\\Windows" + files[i]);
            if (f.isDirectory() == true) {
                str = "<dir>";
            }

            System.out.println(files[i] + "\t\t" + str);

        }

    }
}
