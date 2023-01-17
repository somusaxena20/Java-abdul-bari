
package javapractice.awt;

import java.awt.*;
import java.util.Scanner;

class myFrame extends Frame
{
    Scanner sc = new Scanner(System.in);
    
    Button b;
    Label l;
    TextField tf;
    
    public myFrame(String s)
    {
        super(s);
        System.out.println("LABEL NAME : ");
        l = new Label(sc.nextLine());
        System.out.println("ENTER BUTTON PLACE"
                + " HOLDER : ");
        b = new Button(sc.nextLine());
        System.out.println("ENTER TEXT FIELD SIZE : ");
        tf = new TextField(sc.nextInt());
        setLayout(new FlowLayout());
        add(l);
        add(tf);
        add(b);
        System.out.println("SET SIZE OF WINDOW : ");
        setSize(sc.nextInt(),sc.nextInt());
        setVisible(true);
        
    }
}

public class MyApp2 {
    public static void main(String[] args) {
        myFrame m = new myFrame("JIO SAVAN");
    }
}
