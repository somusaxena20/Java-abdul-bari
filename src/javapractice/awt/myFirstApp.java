
package javapractice.awt;

import java.awt.*;

public class myFirstApp {
    public static void main(String[] args) {
        Frame f = new Frame("MY FIRST APP");
        
        f.setLayout(new FlowLayout());
        
        Button b = new Button("OK");
        Label l = new Label("NAME : ");
        f.add(l);
        f.add(b);
        
        f.setSize(800, 800);
        f.setVisible(true);
        
    }
}
