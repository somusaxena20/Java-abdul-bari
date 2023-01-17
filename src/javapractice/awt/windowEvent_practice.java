package javapractice.awt;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

class MyWindow extends Frame implements WindowListener {

    Label l;

    public MyWindow() {
        super("MY WINDOW EVENT");
        Image i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\HOME\\Downloads\\bmw.png");

        setIconImage(i);

        l = new Label("        ");
        add(l);
        addWindowListener(this);
    }
    
    LocalDateTime t = LocalDateTime.now();
            

    @Override
    public void windowOpened(WindowEvent we) {
        
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {

    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        setBackground(Color.BLACK);
    }

    @Override
    public void windowActivated(WindowEvent we) {
        l.setText(t.getHour()+" : "+t.getMinute()+" : "+t.getSecond());
    }

    @Override
    public void windowDeactivated(WindowEvent we) {

    }
}

public class windowEvent_practice {

    public static void main(String[] args) {
        MyWindow m = new MyWindow();
        m.setSize(600, 600);
        m.setVisible(true);
    }
}
