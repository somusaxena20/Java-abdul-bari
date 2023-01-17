
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;


class MyKey extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;
    
    public MyKey()
    {
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");
        
        setLayout(null);
        
        l1.setBounds(40,50,400,50);
        l2.setBounds(40,150,400,50);
        l3.setBounds(40,250,400,50);
        l4.setBounds(40,350,400,50);
        
        l1.setBackground(Color.BLACK);
        l2.setBackground(Color.BLACK);
        l3.setBackground(Color.BLACK);
        l4.setBackground(Color.BLACK);
        
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        
        
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        addKeyListener(this);
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        l1.setText(String.valueOf(ke.getKeyChar()));
        l2.setText("");
        l3.setText("");
        l4.setText(new Date(ke.getWhen())+"");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        l1.setText("");
        l2.setText("KEY REALISED");
        l3.setText("");
        l4.setText(new Date(ke.getWhen())+"");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        l1.setText("");
        l2.setText("");
        l3.setText(String.valueOf(ke.getKeyChar()));
        l4.setText(new Date(ke.getWhen())+"");
    }
    
}

public class keyEvent_practice {
    public static void main(String[] args) {
        MyKey m = new MyKey();
        m.setSize(600,600);
        m.setVisible(true);
    }
}
