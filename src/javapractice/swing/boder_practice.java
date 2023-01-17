package javapractice.swing;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.border.*;
import java.awt.Shape;
import javax.swing.*;
import javax.swing.plaf.TextUI;

class myBorder extends JFrame
{
    JLabel l1;
    JButton b;
    JTextField tf;
    JPanel p;
    
    public myBorder()
    {
        super("BODER DEMO");
        
        l1 = new JLabel("USERNAME : ");
        b = new JButton("LOGIN");
        tf = new JTextField(25);
        p = new JPanel();
        p.add(l1);
        p.add(tf);
        p.add(b);
        p.setBackground(Color.lightGray);
        
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        Border br = BorderFactory.createSoftBevelBorder(15);
        
        
        
        setLayout(new FlowLayout());
        
       add(p);
       p.setBorder(br);
    }
    
}

public class boder_practice {
    public static void main(String[] args) {
        myBorder m = new myBorder();
        m.setSize(600,600);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
