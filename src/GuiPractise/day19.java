/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiPractise;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class day19 implements ActionListener{

    JFrame frame;
    JLabel lbl_1;
    JLabel lbl_2,lbl_3;
    JTextField txt_1, txt_2,txt_3;
    JButton btn_add, btn_close;

    public day19() {
        frame = new JFrame();
        frame.setSize(350, 350);
        frame.setTitle("raajan");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // initilization of jlabel
        lbl_1 = new JLabel();
        lbl_1.setText("First No");

        // for lbl2
        lbl_2 = new JLabel();
        lbl_2.setText("Second No");
        
        // 
        lbl_3 = new JLabel();
        lbl_3.setText("result");

        // initilixation of text
        txt_1 = new JTextField();
        txt_1.setColumns(8);
        
        txt_2 = new JTextField();
        txt_2.setColumns(8);
        
         txt_3 = new JTextField();
        txt_3.setColumns(8);
        
        // initilization of jbotton 
        btn_add = new JButton();
        btn_add.setText("ADD");
        btn_add.addActionListener(this);

        btn_close = new JButton();
        btn_close.setText("Close");
        btn_close.addActionListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(lbl_1);
        frame.add(txt_1);
        
        frame.add(lbl_2);
        frame.add(txt_2);
        
        frame.add(lbl_3);
        frame.add(txt_3);
        
        frame.add(btn_add);
        frame.add(btn_close);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
    if (ae.getSource().equals(btn_add))
    {
        System.out.println("you clicked on add button");
        double num1,num2,num3;
        num1=Double.parseDouble(txt_1.getText());
        num2=Double.parseDouble(txt_2.getText());
        num3=num1+num2;
        System.out.println(num3);
        txt_3.setText(Double.toString(num3));
       
    }
     if (ae.getSource().equals(btn_close))
    {
        System.out.println("you clicked on close button");
        System.exit(0);
    }
    }

}
