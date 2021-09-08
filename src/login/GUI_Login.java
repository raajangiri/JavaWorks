
package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI_Login implements ActionListener  {
    JFrame frame;
    
    JLabel lbl1, lbl2;
    JLabel lbl_message;
    JTextField txt_loginname,txt_password;
    JButton btn_login,btn_close;
    
    public GUI_Login ()
    {
         frame = new JFrame();
        frame.setTitle("Main Window");
        frame.setSize(350, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
      lbl_message=new JLabel();
        txt_loginname = new JTextField();
        txt_loginname.setColumns(8);
        txt_password = new JTextField();
        txt_password.setColumns(8);
        btn_login=new JButton("Login");
        btn_close=new JButton("close");
         frame.add(new JLabel("login name"));
         frame.add(txt_loginname);
         frame.add(new JLabel("login password"));
         frame.add(txt_password);
         frame.add(btn_login);
         frame.add(btn_close);
         
         frame.add(lbl_message);
         
         btn_login.addActionListener(this);
         btn_close.addActionListener(this);
          frame.setVisible(true);
        
        
    }
        public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn_login))  {
            lbl_message.setText("login....");
            String tmp_name=txt_loginname.getText();
            String tmp_password=txt_password.getText();
            Login login=new Login(tmp_name,tmp_password);
            DBLogin db_login=new DBLogin();
            LoginInfo login_result=db_login.login(login);
            
           lbl_message.setText(login_result.message.getMessage());
          
        } else if (ae.getSource().equals(btn_close)) {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
    new GUI_Login ();
    }

 
}

