package GuiPractise;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import jdbc.DB_Person;

public class miniproject2 implements ActionListener {

    JFrame frame;
    JMenuBar menu_bar1;
    JMenu menu_1;
    JMenuItem menu_item1;
    // JLabel lbl1, lbl2, lbl3;
    JLabel lbl1, lbl2, lbl3, lblp, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10;
    JTextField txt1, txt2, txt3;
    JTextField txt_id, txt_name, txt_address, txt_email, txt_userid;
    JButton btn_add, btn_close, btn_save,btn_search;
    JPasswordField txt_password;
    JTextArea txt_comment;
    JRadioButton rb1, rb2;
    JCheckBox ch1, ch2, ch3;
    JComboBox cmb1, cmb2;
    JList list1;

    public miniproject2() {
        frame = new JFrame();
        frame.setTitle("Main Window");
        frame.setSize(350, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // add controls
        lbl1 = new JLabel();
        lbl1.setText(" age ");
        lbl2 = new JLabel();
        lbl2.setText(" gender ");
        lbl3 = new JLabel();
        lbl3.setText(" hobbiles");
        lblp = new JLabel();
        lblp.setText(" password ");
        lbl4 = new JLabel();
        lbl4.setText(" id ");
        lbl5 = new JLabel();
        lbl5.setText(" name ");
        lbl6 = new JLabel();
        lbl6.setText(" address ");
        lbl7 = new JLabel();
        lbl7.setText(" email ");
        lbl8 = new JLabel();
        lbl8.setText(" user id ");
        lbl9 = new JLabel();
        lbl9.setText(" comments ");
        lbl10 = new JLabel();
        lbl10.setText(" ACD ");

        txt_id = new JTextField();
        txt_id.setColumns(8);
        txt_name = new JTextField();
        txt_name.setColumns(8);
        txt_address = new JTextField();
        txt_address.setColumns(8);
        txt_email = new JTextField();
        txt_email.setColumns(8);
        txt_userid = new JTextField();
        txt_userid.setColumns(8);

        btn_close = new JButton();
        btn_close.setText("close");
        btn_close.addActionListener(this);

        btn_save = new JButton();
        btn_save.setText("save");
        btn_save.addActionListener(this);
        btn_search=new JButton("search");
        btn_search.addActionListener(this);

        txt_password = new JPasswordField("<password>");
        txt_password.setColumns(8);
        txt_password.setEchoChar('@');

        txt_comment = new JTextArea(5, 20);
        txt_comment.setText("<comment>");

        rb1 = new JRadioButton("male", false);
        rb2 = new JRadioButton("female",false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        ch1 = new JCheckBox("reading");
        ch2 = new JCheckBox("playing");
        ch3 = new JCheckBox("others");

        String[] str = {"1-14", "15-30", "30+"};
        cmb1 = new JComboBox(str);
        cmb2 = new JComboBox();
        String str_list[] = {"bkt", "ktm", "lit "};
        list1 = new JList(str_list);

// adding 
        frame.add(lbl4);
        frame.add(txt_id);
      
        frame.add(lbl6);
        frame.add(txt_address);
        frame.add(lbl7);
        frame.add(txt_email);

        frame.add(lblp);

        frame.add(btn_save);

        frame.add(btn_close);
        frame.add(btn_search);
        frame.add(lbl8);
        frame.add(txt_userid);

        frame.add(lblp);

        frame.add(txt_password);
        frame.add(lbl9);
        frame.add(txt_comment);
        frame.add(lbl2);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(lbl3);
        frame.add(ch1);
        frame.add(ch2);
        frame.add(ch3);
        frame.add(lbl1);
        frame.add(cmb1);

        frame.add(lbl10);
        frame.add(list1);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn_save)) {
            System.out.println("saving...");
            String gender;
            byte hb1=0,hb2=0;// 0-false  1-true // reading or playing 
            String age_grp;
            String address;
            int id;
            int playing = 0,reading=0;
            
            if(rb1.isSelected()==true)
            gender="male";
            
            
            else gender="female";
            
            
             if(ch1.isSelected()==true)
                hb1=1;
               if(ch1.isSelected()==true) 
                hb2=1;
               
            age_grp=cmb1.getSelectedItem().toString();
            
            address=list1.getSelectedValue().toString();
            
            id=Integer.parseInt(txt_id.getText());
            
            System.out.println( id +" "+gender+" "+hb1+" "+hb2+" "+age_grp+" "+address);
           Person p=new Person(id,address,playing,reading,gender,age_grp);  
           boolean res=new DB_Person().saveRecord(p);
           if(res)
           {
               System.out.println("save record succesfully");
           }
           else 
                System.out.println("error to save recors");

        }
       else if (ae.getSource().equals(btn_search)){
            System.out.println("Searching....");
            int id;
            id=Integer.parseInt(txt_id.getText());
            Person p=new DB_Person().searchRecord(id);
            System.out.println(p.getGender());
            if(p.getGender().equals("male"))
            {
            rb1.setSelected(true);
            }
            
               
       } 
        
        else if (ae.getSource().equals(btn_close)) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
    new miniproject2();

    }

}
