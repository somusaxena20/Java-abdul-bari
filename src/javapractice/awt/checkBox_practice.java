
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;

class myCheckBox extends Frame implements ItemListener
{
    Label l;
    CheckboxGroup cg;
    Checkbox c1,c2,c3;
    
    public myCheckBox()
    {
        super("CHECK BOX APP");
        l = new Label("NOTHING IS SELECTED");
        cg = new CheckboxGroup();
        c1 = new Checkbox("JAVA",false,cg);
        c2 = new Checkbox("PYTHON",false,cg);
        c3 = new Checkbox("C++",false,cg);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        String s ="";
        if (c1.getState()) {
            s = s+" "+c1.getLabel();
        }
        if (c2.getState()) {
            s = s+" "+c2.getLabel();
        }
        if (c3.getState()) {
            s = s+" "+c3.getLabel();
        }
        if(s.isEmpty()){s = "NOTHING IS SELECTED";}
        l.setText(s);
    }
    
}

public class checkBox_practice {
    public static void main(String[] args) {
        myCheckBox c = new myCheckBox();
        c.setSize(600, 600);
        c.setVisible(true);
    }
}
