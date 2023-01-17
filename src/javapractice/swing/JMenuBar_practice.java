package javapractice.swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

class myFrame extends JFrame implements ActionListener
{
    int a = 0;
    JToolBar tb;
    JMenuBar mb;
    JMenu file;
    JMenuItem m1,m2;
    JButton b1,b2,b3,b4,b5;
    JTextArea ta;
    
    public myFrame()
    {
        tb = new JToolBar();
        
        mb = new JMenuBar();
        
        file = new JMenu("FILE");
        
        m1 = new JMenuItem("NEW");
        m1.setFont(new Font("Raleway",Font.BOLD,24));
        m2 = new JMenuItem("OPEN");
        m2.setFont(new Font("Raleway",Font.BOLD,24));
        file.add(m1);
        file.setFont(new Font("Raleway",Font.BOLD,24));
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        this.setJMenuBar(mb);
//        add(mb,BorderLayout.NORTH);
        
        b1 = new JButton(new ImageIcon("resource/new.jpg"));
        b2 = new JButton(new ImageIcon("resource/open.jpg"));
        b2.setSize(10, 10);
        b3 = new JButton(new ImageIcon("resource/save.jpg"));
        b4 = new JButton(new ImageIcon("resource/close.jpg"));
        b5 = new JButton(new ImageIcon("resource/bold.jpg"));
        tb.add(b1);
        tb.add(new JToolBar.Separator());
        tb.add(b2);
        tb.add(new JToolBar.Separator());
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(new JToolBar.Separator());
        tb.add(b5);
        
        add(tb,BorderLayout.NORTH);
        ta = new JTextArea();
        ta.setFont(new Font("Share Tech",Font.PLAIN,30));
        JScrollPane p = new JScrollPane(ta);
        add(p,BorderLayout.CENTER);
        b2.addActionListener(this);
        m2.addActionListener(this);
        b5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            JFileChooser jp = new JFileChooser();
            jp.setFileSelectionMode(JFileChooser.WHEN_FOCUSED);
            jp.setDialogType(JFileChooser.SAVE_DIALOG);
//            jp.setName("OPEN FILE");
            jp.showOpenDialog(this);
            File f = jp.getSelectedFile();
            try(FileInputStream f1 = new FileInputStream(f))
            {
                byte b[] = new byte[f1.available()];
                f1.read(b);
                String s= new String(b);
                ta.setText(s);
            }
            catch(Exception ee)
            {
                
            }
        }
        else if (e.getSource() == b5) {
            
            if(a==0)
            {
                b2.setForeground(Color.red);
                b2.setBorder(BorderFactory.createRaisedBevelBorder());
                ta.setFont(new Font("Share Tech",Font.BOLD,30));
                ++a;
            }
            else
            {
                b2.setBorder(BorderFactory.createEmptyBorder());
                ta.setFont(new Font("Share Tech",Font.PLAIN,30));
                --a;
            }
        }
        else if (e.getSource() == m2) {
            JFileChooser jp = new JFileChooser();
            jp.showOpenDialog(this);
            File f = jp.getSelectedFile();
            try(FileInputStream f1 = new FileInputStream(f))
            {
                byte b[] = new byte[f1.available()];
                f1.read(b);
                String s= new String(b);
                ta.setText(s);
            }
            catch(Exception ee)
            {
                
            }
        }
        
    }
    
}

public class JMenuBar_practice {
    public static void main(String[] args) {
        myFrame m = new myFrame();
        m.setSize(800,800);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
