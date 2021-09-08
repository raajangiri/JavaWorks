package GuiPractise;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grid implements ActionListener {

    JFrame frame;
    JLabel lbl1, lbl2, lbl3;
    JTextField txt_name, txt_address, txt_id;
    JButton btn_save, btn_close;

    public Grid() {
        frame = new JFrame();
        frame.setTitle("gui table ");
        frame.setSize(350, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        lbl1 = new JLabel("id");
        lbl2 = new JLabel("name");
        lbl3 = new JLabel("address");

        txt_name = new JTextField(8);
        txt_address = new JTextField(8);
        txt_id = new JTextField(8);

        btn_save = new JButton("save");
        btn_save.addActionListener(this);
        btn_close = new JButton("close");
        btn_close.addActionListener(this);

        frame.add(lbl1);
        frame.add(txt_id);
        frame.add(lbl2);
        frame.add(txt_name);
        frame.add(lbl3);
        frame.add(txt_address);
        frame.add(btn_save);
        frame.add(btn_close);

        frame.setVisible(true);

    }

    public static void main(String args[]) {
        new Grid();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn_close)) {
            System.exit(0);
        }
    }

}
