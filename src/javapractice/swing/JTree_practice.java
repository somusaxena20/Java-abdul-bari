package javapractice.swing;

import java.awt.Desktop;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.tree.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
//import java.

class myTree extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel label;
    
    public myTree()
    {
        super("TREE DEMO");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\");
        
        File f = new File("C:\\New folder");
        
        for(File x : f.listFiles())
        {
            if (x.isDirectory()) {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for(File y : x.listFiles())
                {
                    temp.add(new DefaultMutableTreeNode(x.getName()));
                }
                root.add(temp);
            }
            else
            {
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }
        tree = new JTree(root);
        label = new JLabel("NO FILE SELECTED");
       
        JScrollPane sp = new JScrollPane(tree);
        sp.setBorder(BorderFactory.createLineBorder(Color.yellow));
        tree.addTreeSelectionListener(this);
        add(sp,BorderLayout.CENTER);
        add(label,BorderLayout.SOUTH);
       
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        
        
        
        label.setSize(50, 30);
        try{
            
            File f1 = new File(label.getName().replace('\\', '/'));
            Desktop desktop = Desktop.getDesktop();
            
            desktop.open(f1);
        }
        catch(Exception ex)
        {
            
        }
    }
    
    
    
}


public class JTree_practice {
    public static void main(String[] args) {
        myTree m = new myTree();
        m.setSize(400, 400);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
