
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class countApp extends Frame implements ActionListener {
    int count=0,x;
    Label l;
    Button b[] = new Button[15];
    TextField t1;
    TextField t2;
    TextField t3;
    
    Scanner sc = new Scanner(System.in);
    
    public countApp()
    {
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        l = new Label("         "+count);
//        t1.setSize(100, 10);
        b[0] = new Button("+");
        b[1] = new Button("-");
        b[2] = new Button("X");
        b[3] = new Button("/");
        b[4] = new Button("7");
        b[5] = new Button("8");
        b[6] = new Button("9");
        b[7] = new Button("4");
        b[8] = new Button("5");
        b[9] = new Button("6");
        b[10] = new Button("1");
        b[11] = new Button("2");
        b[12] = new Button("3");
        b[13] = new Button("0");
        b[14] = new Button("=");
        
       
        setLayout(new FlowLayout());
        add(l);
        add(t1);
        add(t2);
        add(t3);
       
        for (int i = 0; i < b.length; i++) {
            b[i].addActionListener(this);
        }
        
        for (int i = 0; i < b.length; i++) {
            add(b[i]);
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == b[0]) {
            t3.setText(String.valueOf(Integer.valueOf(t1.getText())+Integer.valueOf(t2.getText())));
        }
        else if (e.getSource() == b[1]) {
            t3.setText(String.valueOf(Integer.valueOf(t1.getText())-Integer.valueOf(t2.getText())));
        }
        else if (e.getSource() == b[2]) {
            t3.setText(String.valueOf(Integer.valueOf(t1.getText())*Integer.valueOf(t2.getText())));
        }
        else if (e.getSource() == b[3]) {
            t3.setText(String.valueOf(Integer.valueOf(t1.getText())/Integer.valueOf(t2.getText())));
        }
         
        
    }
    public static void main(String[] args) {
        countApp c = new countApp();
        c.setSize(600, 600);
        c.setVisible(true);
    }

    
}
