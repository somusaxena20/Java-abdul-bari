
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;

class myLayout extends Frame
{
    Button b[]=new Button[10];
    
    public myLayout()
    {
        super("MY LAYOUT DEMO");
        for (int i = 0; i < b.length ; i++) {
            b[i] = new Button("0"+i);
            b[i].setForeground(Color.white);
            b[i].setBackground(Color.BLACK);
        }
        
        GridLayout g = new GridLayout(3,3);
        g.setHgap(20);
        setLayout(g);
        
//        for (int i = 0; i < b.length; i++) {
//            if(i==0)
//                add(b[i],BorderLayout.EAST);
//            if(i==1)
//                add(b[i],BorderLayout.SOUTH);
//            if(i==2)
//                add(b[i],BorderLayout.CENTER);
//            if(i==3)
//                add(b[i],BorderLayout.NORTH);
//            if(i==4)
//                add(b[i],BorderLayout.WEST);
//        }
       for(Button x : b)
           add(x);
    }
    
}

public class LayoutManagar_practice {
    public static void main(String[] args) {
        myLayout m = new myLayout();
        m.setSize(600,600);
        m.setVisible(true);
    }
}
