package javapractice.awt;

import java.awt.*;

class myPaint extends Frame implements Runnable {

    int x, y, tx, ty;

    public myPaint() {
        super("ANIMATION");
        x = 100;
        y = 100;
        tx = ty = 1;
        
        this.setBackground(Color.BLACK);
        Thread t = new Thread(this);
        t.start();

    }

    public void run() {
        while (true) {
            x += tx;
            y += ty;

            if (x < 0 || x > 450) {
                tx = tx * (-1);
            }
                if (y < 20 || y > 350) {
                    ty = ty * (-1);
                }
                repaint();
                try{Thread.sleep(5);}catch(Exception e){}
            }

        }
    

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x,y , 50, 50);
      
    }
}

public class painting_practice {

    public static void main(String[] args) {
        myPaint m = new myPaint();
        m.setSize(500, 400);
        m.setVisible(true);

    }
}
