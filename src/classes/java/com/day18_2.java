/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;
import javax.swing.JFrame;



public class day18_2 {
    JFrame frame;
    public day18_2()
    {
    frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250,350);
    frame.setResizable(false);
    frame.setTitle("frame window");
    System.out.println(frame.getTitle());
    frame.setVisible(true);
    
    
    }
    public static void main(String args[])
    {
        new day18_2();
    
    }
}
