
package javapractice.Multithreding;


class myData
{
    synchronized public void display(String s)
    {
//        synchronized(this)
//        {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            try{Thread.sleep(100);}catch(InterruptedException e){}
//        }
        }
    }
}

class myThread1 extends Thread
{
    myData d;
    myThread1(myData d)
    {
        this.d = d;
    }
    @Override
    public void run()
    {
        d.display("HELLO WORLD");
    }
}

class myThread2 extends Thread
{
    myData data;
    myThread2(myData d)
    {
        this.data=d;
    }
    @Override
    public void run()
    {
        data.display("WELCOME ALL");
    }
}

public class synchronization_using_monitor {
    public static void main(String[] args) {
        myData d = new myData();
        myThread1 t1 = new myThread1(d);
        myThread2 t2 = new myThread2(d);
        t1.start();
        t2.start();
    }
}
