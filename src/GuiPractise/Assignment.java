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

public class Assignment extends JFrame implements ActionListener{

    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
    JButton btn1;

    public Assignment() {

        setSize(350, 500);
        setTitle("Raajan");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl1 = new JLabel();
        lbl1.setText(" Name   ");
        lbl2 = new JLabel();
        lbl2.setText(" section  ");
        lbl3 = new JLabel();
        lbl3.setText(" grade  ");
        lbl4 = new JLabel();
        lbl4.setText(" roll  ");
        lbl5 = new JLabel();
        lbl5.setText(" sub1  ");
        lbl6 = new JLabel();
        lbl6.setText("  sub2 ");
        lbl7 = new JLabel();
        lbl7.setText("  total  ");
        lbl8 = new JLabel();
        lbl8.setText("  avg ");

        txt1 = new JTextField();
        txt1.setColumns(8);
        txt2 = new JTextField();
        txt2.setColumns(8);
        txt3 = new JTextField();
        txt3.setColumns(8);
        txt4 = new JTextField();
        txt4.setColumns(8);
        txt5 = new JTextField();
        txt5.setColumns(8);
        txt6 = new JTextField();
        txt6.setColumns(8);
        txt7 = new JTextField();
        txt7.setColumns(8);
        txt8 = new JTextField();
        txt8.setColumns(8);
        btn1=new JButton();
        btn1.setText("cal");
        btn1.addActionListener(this);
        

        setLayout(new FlowLayout());

        add(lbl1);
        add(txt1);
        
        add(lbl2);
        add(txt2);
        
        add(lbl3);
        add(txt3);
        
        add(lbl4);
        add(txt4);
        
        add(lbl5);
        add(txt5);
        
        add(lbl6);
        add(txt6);
        
        add(lbl7);
        add(txt7);
        
        add(lbl8);
        add(txt8);
        
        add(btn1);

        setVisible(true);
        
    }
      @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource().equals(btn1))
        { double  num1,num2,num3,num4;
        num1=Double.parseDouble(txt5.getText());
        num2=Double.parseDouble(txt6.getText());
        num3=num1+num2;
        System.out.println(num3);
        txt7.setText(Double.toString(num3));
        num4=num3/2;
        txt8.setText(Double.toString(num4));
        
        }
        
    }
  }
 


