
package javapractice.awt;

import java.awt.*;
import java.awt.event.*;

class MyMouse extends Frame implements MouseListener,MouseMotionListener,MouseWheelListener
{
    Label l1,l2;
    
    public MyMouse()
    {
        l1 = new Label("");
        l2 = new Label("");
        
        l1.setBounds(50,50,300,50);
        l1.setBackground(Color.MAGENTA);
        l2.setBounds(50,250,300,50);
        l2.setBackground(Color.MAGENTA);
        
        setLayout(null);
        setBackground(Color.GREEN);
        add(l1);
        add(l2);
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }

    
    
    @Override
    public void mouseClicked(MouseEvent me) {
        l1.setText("MOUSE CLICKED");
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        l1.setText("MOUSE PRESSED");
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        l1.setText("MOUSE RELEASED");
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        l1.setText("MOUSE ENTERED");
        setBackground(Color.cyan);
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        l1.setText("MOUSE EXITED");
        setBackground(Color.GREEN);
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        l1.setText("MOUSE DRAGGED");
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        l1.setText("MOUSE MOVED");
        l2.setText("("+me.getX()+","+me.getY()+")");
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent me) {
        l1.setText("MOUSE WHEEL ROATED");
        l2.setText("("+me.getX()+","+me.getY()+")");
    }
    
}


public class mouseEvenet_practice {
    public static void main(String[] args) {
        MyMouse m = new MyMouse();
        m.setSize(600, 600);
        m.setVisible(true);
    }
}
