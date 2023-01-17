

package javapractice.Multithreding;

class MyThread1 extends Thread
{
    public MyThread1(String Name)
    {
        super(Name);
    }
    
    @Override
    public void run() 
    {
        int count=1;
       
        while(true)
        {
            System.out.println(count+++" MY THREAD 1");
        }
        
    }
}
class MyThread2 extends Thread
{
    public MyThread2(String Name)
    {
        super(Name);
    }
    
    @Override
    public void run() 
    {
        int count=1;
       
        while(true)
        {
            System.out.println(count+++" MY THREAD 2");
            Thread.yield();
        }
        
    }
}

public class Thread_states {
    public static void main(String[] args)throws Exception {
        MyThread1 m = new MyThread1("SOMU");
        MyThread2 m1 = new MyThread2("SUJEET");
//        m.setDaemon(true);
//        m1.setDaemon(true);
        m1.start();
        
        m.start();
//        Thread ThreadMain = Thread.currentThread();
//        ThreadMain.join();
        
        
        
//        try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);};
//        m.setPriority(8);

        
        
        
//        m.checkAccess();
//        System.out.println(m.getId());
//        System.out.println(m.getName());
//        System.out.println(m.getState());
//        System.out.println(m.getState());
//        System.out.println(m.getState());
//        System.out.println(m.getPriority());
//        System.out.println(m.isAlive());
//        System.out.println(m.getState());
    }
}
