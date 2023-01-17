package javapractice.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.text.NumberFormatter;
//import java.awt.event.*;

class myFormat extends JFrame 
{
    JTextField t1,t2;
    DateFormat df;
    JFormattedTextField tf2,tf3;
    NumberFormat nf;
    NumberFormatter nft;
    
    public myFormat(){
        t1 = new JTextField(15);
        df = new SimpleDateFormat("dd//MM//yyyy");
        tf2 = new JFormattedTextField(df);
        
        tf2.setColumns(15);
        tf2.setValue(0);
        
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        
        add(t1);
        add(tf2);
    }

    
}

public class JTextFiled_JFormattedTextField {
    public static void main(String[] args) {
        myFormat m = new myFormat();
        m.setSize(600, 600);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
}
