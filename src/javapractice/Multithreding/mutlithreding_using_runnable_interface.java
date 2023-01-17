

package javapractice.Multithreding;

class MyRunnable implements Runnable
{
    public void run()
    {
        int i = 1;
        
        while(true)
        {
            System.out.println(i+" HELLO");
            i++;
        }
        
    }
}

public class mutlithreding_using_runnable_interface {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        
        int i = 1;
        
        while(true)
        {
            System.out.println(i+" WORLD");
            i++;
        }
    }
}
