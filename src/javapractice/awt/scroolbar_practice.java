
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;

class myScroll extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;
    
    public myScroll()
    {
        super("SCROLL BAR DEMO");
        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf = new TextField(20);
        
        tf.setBounds(50, 50, 300, 50);
        tf.setBackground(Color.yellow);
        red.setBounds(30, 250, 300, 30);
        green.setBounds(50, 150, 300, 30);
        blue.setBounds(50, 350, 300, 30);
        setLayout(null);
        add(tf);
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
    }
    
     
    
}


public class scroolbar_practice {
    public static void main(String[] args) {
        myScroll m = new myScroll();
        m.setSize(600, 600);
        m.setVisible(true);
    }
}
