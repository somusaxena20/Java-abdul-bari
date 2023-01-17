
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;

class MyCardLayout extends Frame implements ItemListener
{
    Checkbox c1,c2;
    CheckboxGroup cg;
    Button b1,b2,b3;
    TextField t1,t2,t3;
    Panel p1,p2,p3,main;
    CardLayout cl;
    public MyCardLayout()
    {
        super("MY CARD LAYOUT");
        cg = new CheckboxGroup();
        c1 = new Checkbox("ONE",true,cg);
        c2 = new Checkbox("TWO",false,cg);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        
        b1 = new Button("ONE");
        b1.setSize(40, 40);
        b2 = new Button("TWO");
        b3 = new Button("THREE");
        
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        main = new Panel();
        
        p3.add(c1);
        p3.add(c2);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);
        
        cl = new CardLayout();
        
        main.setLayout(cl);
        main.add("ONE",p1);
        main.add("TWO",p2);
        
        add(p3,BorderLayout.NORTH);
        add(main,BorderLayout.CENTER);
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(c1.getState())
            cl.first(main);
        else
            cl.last(main);
    }
    
}

public class cardLayout_practice {
    public static void main(String[] args) {
        MyCardLayout m = new MyCardLayout();
        m.setSize(600,600);
        m.setVisible(true);
    }
}
