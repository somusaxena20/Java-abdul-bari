
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;

class myTextarea extends Frame implements ActionListener,TextListener 
{
    TextArea ta;
    TextField tf;
    Button b;
    Label l;
    String str ="";
    public myTextarea()
    {
        super("TEXT AREA DEMO");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("CLICK");
        l = new Label("NOTHING IS SELECTED");
        
        setLayout(new FlowLayout());
        
        add(ta);
        add(tf);
        add(l);
        add(b);
       
        b.addActionListener(this);
        
    }
    
    @Override
    public void textValueChanged(TextEvent e)
    {
        str = tf.getText();
        ta.append(str);
        l.setText(str);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        str = tf.getText();
        ta.append(str);
        l.setText(str);
    }
}

public class teatarea_operation {
    public static void main(String[] args) {
        myTextarea m = new myTextarea();
        m.setSize(600, 600);
        m.setVisible(true);
    }
}
