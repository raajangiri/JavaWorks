/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package working_package;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class day20_2 extends JFrame  {
    JLabel lbl_1, lbl_2;
    JButton btn_add, btn_close;
    JTextField txt_1,txt_2;

    public day20_2() {
        setSize(250, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("raajan");
        setLayout(new FlowLayout());
        lbl_1=new JLabel();
        lbl_1.setText("Enter First Number:");
        
        
        lbl_2=new JLabel();
        lbl_2.setText("Enter First Number:");
        
        
        add(lbl_1);
        setVisible(true);
        
        
    }

}
