package javapractice.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

class myFrame1 extends JFrame implements ActionListener {

    JButton b1, b2;
    JLabel l1, l2;
    int count = 0;

    public myFrame1() {

        super("SWING DEMO");

        this.setLayout(new FlowLayout());
        b1 = new JButton("SEARCH");
        b2 = new JButton("RESET");
       
        
        
        this.getRootPane().setDefaultButton(b1);
//        b1.setIcon(new ImageIcon("C:\\Users\\HOME\\Downloads\\bmw.png"));
//        b1.setSize(10,10);
        b1.setToolTipText("INCREASE COUNT");
        b2.setToolTipText("RESET COUNT");

        l1 = new JLabel("CLICKED " + count + " TIMES");

        this.add(l1);
        
        this.add(b1);

        this.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            count++;
            l1.setText("CLICKED " + count + " TIMES");
        }
        if (e.getSource() == b2) {
            count = 0;
            l1.setText("CLICKED " + count + " TIMES");
        }
    }

}

public class first_app {

    public static void main(String[] args) {
        myFrame1 m = new myFrame1();
        m.setSize(600, 600);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
