
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;
import java.time.Year;
import java.time.Month;
import java.time.DayOfWeek;
        
class myList extends Frame implements ItemListener
{
    List l1,l2,l3;
    Choice c;
    TextArea tf;
    String str;
    public myList()
    {
        super("LIST CHOICE DEMO");
        
        l1 = new List(5,false);
        l2 = new List(5,false);
        l3 = new List(5,false);
        c = new Choice();
        
        tf = new TextArea(20,20);
        Month m[];
        DayOfWeek w[];
        l1.setSize(200, 200);
        
        for (int i = 1; i <= 31; i++) {
            l1.add(""+i);
        }
        m = Month.values();
        
        for(Month x : m)
        {
            l2.add(String.valueOf(x));
        }
        
        for (int i = 1990; i <= 2021 ; i++) {
            l3.add(""+i);
        }
        w = DayOfWeek.values();
        for(DayOfWeek x : w)
            c.add(""+x);
        
        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(l3);
        add(c);
        add(tf);
        l1.addItemListener(this);
        l2.addItemListener(this);
        l3.addItemListener(this);
    }
    
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == l1) {
            tf.append(l1.getSelectedItem());
        }
        else if (ie.getSource() == l2) {
            tf.append("-"+l2.getSelectedItem()+"-");
        }
        else if (ie.getSource() == l3) {
            tf.append(l3.getSelectedItem()+"\n");
        }
    }
     
}

public class listBox_choice {
    public static void main(String[] args) {
        myList l = new myList();
        l.setSize(600,600);
        l.setVisible(true);
    }
}
