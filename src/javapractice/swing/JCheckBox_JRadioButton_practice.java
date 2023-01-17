package javapractice.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import java.awt.FlowLayout;
//import java.awt.event.KeyEvent;
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//import javax.swing.JRadioButton;
//import javax.swing.JCheckBox;
//import javax.swing.ButtonGroup;


class myCheckBox extends JFrame implements ActionListener
{
    JTextField tf;
    JCheckBox c1,c2;
    JRadioButton r1,r2;
   
    public myCheckBox()
    {
        super("demo");
        
        tf = new JTextField("DEMO TEXT",20);
        tf.setBounds(70, 40, 100, 50);
        
        c1 = new JCheckBox("BOLD");
//        c1.setMnemonic(KeyEvent.VK_B);
        c2 = new JCheckBox("ITALIC");
//        c2.setMnemonic(KeyEvent.VK_I);
        
        
        
//        ButtonGroup b = new ButtonGroup();
//        b.add(c1);
//        b.add(c2);
        
        this.setLayout(new FlowLayout());
        this.add(tf);
        this.add(c1);
        this.add(c2);
        this.add(r1);
        this.add(r2);
        
    }
    
    public void actionPerformed(ActionEvent e )
    {
        
    }
    
    
}

public class JCheckBox_JRadioButton_practice {
    public static void main(String[ ] args) {
        myCheckBox m = new myCheckBox();
        m.setSize(1000,600);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
