package javapractice.swing;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


class externalFrame extends JInternalFrame
{
    static int count = 0;
    JTextArea mb;
    JScrollPane j;
     
    public externalFrame()
    {
        super("DOCUMENT "+(++count),true,true,true,true);
        mb = new JTextArea();
        j = new JScrollPane(mb);
        
        add(j);
        
        JMenuBar m = new JMenuBar();
        JMenu f = new JMenu("FILE");
        JMenuItem i = new JMenuItem("SAVE");
        
        f.add(i);
        m.add(f);
        this.setMenuBar(m);
        
        this.setSize(400,400);
        this.setLocation(50, 50);
        this.setVisible(true);
    }

    
    
}

class note extends JFrame implements ActionListener
{
    JDesktopPane jp;
    JMenuBar jm;
    JMenu ju;
    JMenuItem ji;
    
    public note()
    {
        super("NOTEPAD");
        jp = new JDesktopPane();
        this.setContentPane(jp);
        
        jm = new JMenuBar();
        ju = new JMenu("DOCUMENT");
        ju.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        ji = new JMenuItem("NEW");
        
        ju.add(ji);
        jm.add(ju);
        
        ji.addActionListener(this);
        
        this.setJMenuBar(jm);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        jp.add(new externalFrame());
    }
}

public class JInternalFrame_practice {
    public static void main(String[] args) {
        note m = new note();
        m.setSize(900, 900);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
