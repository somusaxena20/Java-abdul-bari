package javapractice.Multithreding;

class MyThread extends Thread {

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " HELLO");
            i++;
        }
    }
}

public class Multithreding_Using_Thred_Class {

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

        int i = 1;

        while (true) {
            System.out.println(i + " WORLD");
            i++;
        }

    }

}
