package javapractice.swing;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class myFrame2 extends JFrame implements ChangeListener
{
    JSlider js;
    JProgressBar pb;
    JPanel p1,p2;
    int w = 0;
    
    public myFrame2()
    {
        js = new JSlider(0,100,w);
        js.setMajorTickSpacing(20);
        js.setMinorTickSpacing(1);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        
        js.addChangeListener(this);
        
        pb = new JProgressBar();
        pb.setString(w+"%");
        pb.setStringPainted(true);
//        pb.setIndeterminate(true);
        
        p1 = new JPanel(){
            public void paintComponent(Graphics g)
                {
                    g.drawOval(100, 100,w*2, w*2);
                }
        };
        
        p2 = new JPanel();
        p2.add(pb);
        
        
//        js.setBounds(40, 10, 800, 50);
        
        add(p1,BorderLayout.CENTER);
        add(js,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
//        setLayout(null);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w = js.getValue();
        repaint();
        pb.setString(w+"%");
//        pb.setStringPainted(true);
        pb.setValue(w);
//        pb.setBackground(Color.black);
        
        
        
//        pb.setForeground(Color.white);
    }
    
}

public class JSlider_JProgessBar_practice {
    public static void main(String[] args) {
        myFrame2 m = new myFrame2();
        m.setSize(900, 600);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
