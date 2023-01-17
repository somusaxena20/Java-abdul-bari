package javapractice.swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


class JsplitPane extends JFrame implements ListSelectionListener
{
    JList l;
    JPanel p;
    JLabel lb;
    String s[] = {"RED","ORANGE","YELLOW","GREEN","PINK"};
    public JsplitPane()
    {
        super("   SPLIT PANE");
        l = new JList(s);
        JScrollPane sp = new JScrollPane(l);
        l.addListSelectionListener(this);
        l.setForeground(Color.blue);
        l.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        
        
        p = new JPanel();
        p.add(sp);
        
        
        lb = new JLabel(" ");
        lb.setOpaque(true);
        lb.setBackground(Color.red);
        JScrollPane sp1 = new JScrollPane(lb);
        
        JSplitPane jp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sp,sp1);
        jp.setDividerLocation(200);
         l.setSelectionBackground(Color.black);
         l.setSelectionForeground(Color.white);
        add(jp);
        
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        switch((String)l.getSelectedValue())
        {
            case "RED":
                lb.setBackground(Color.red);
                l.setSize(50, 50);
                break;
            case "ORANGE":
                lb.setBackground(Color.orange);
                break;
            case "YELLOW":
                lb.setBackground(Color.yellow);
                break;
            case "GREEN":
                lb.setBackground(Color.green);
                break;
            case "PINK":
                lb.setBackground(Color.pink);
                break;
        }
    }

    
    
    
}

public class JSplitPane_practice {
    public static void main(String[] args) {
        JsplitPane m = new JsplitPane();
        m.setSize(900, 900);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
