package javapractice.Multithreding;

class MyData {

    public int value;
    public boolean flag = true;
    synchronized public void set(int x) {
        while(flag != true)
            try{wait();}catch(InterruptedException e){}
        this.value = x;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x;
        while(flag != false)
            try{wait();}catch(InterruptedException e){}
        flag = true;
        x = value;
        notify();
        return x;
    }

}

class consumer extends Thread {

    MyData d;

    consumer(MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            d.set(i);
            System.out.println("PRODUCER : " + i);
            i++;
        }
    }
}

class producer extends Thread {

    MyData d;

    producer(MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("CONSUMER : " + d.get());
        }
    }

}

public class inter_thread_communication {

    public static void main(String[] args) {
        MyData d = new MyData();
        producer p = new producer(d);
        consumer c = new consumer(d);
        p.start();
        c.start();
    }
}
