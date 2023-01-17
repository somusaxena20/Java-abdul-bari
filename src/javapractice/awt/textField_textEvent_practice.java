
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;

class myTextField extends Frame implements TextListener,ActionListener
{
    Label l1,l2;
    TextField tf;
    
    myTextField()
    {
        super("TEXT FIELD DEMO");
        l1 = new Label("NO TEXT ENTERED YET");
        l2 = new Label("ENTER NOT HIT YET");
        tf = new TextField(20);
        tf.setEchoChar('*');
        handler h = new handler();
        tf.addTextListener(h);
        tf.addActionListener(h);
        
        setLayout(new FlowLayout());
        
        add(l1);
        add(l2);
        add(tf);
        
    }

    @Override
    public void textValueChanged(TextEvent te) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        l2.setText(tf.getText());
    }
    
    class handler implements ActionListener,TextListener
    {
        @Override
    public void textValueChanged(TextEvent te) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        l2.setText(tf.getText());
    }
    }
}


public class textField_textEvent_practice {
    public static void main(String[] args) {
        myTextField m = new myTextField();
        m.setSize(600, 600);
        m.setVisible(true);
    }
}
