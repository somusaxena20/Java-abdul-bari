
package javapractice.network_programming;

import java.io.*;
import java.net.*;

public class myServer extends Thread {
    Socket s;
    public myServer(Socket s){this.s = s;}
    public void run()
    {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(s.getOutputStream());
            String msg;
            StringBuilder sb;
            
            do {
                msg = br.readLine();
                System.out.println(s.getLocalAddress()+" REQUEST : "+msg);
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
                
            } while (!msg.equals("dne"));
            s.close();
            
        }catch(Exception e){}
           
    }
    public static void main(String[] args) {
        try
        {
        ServerSocket ss = new ServerSocket(2021);
        Socket stk;
        myServer my;
        System.out.println("SERVER STARTED...");
        int count=1;
        do {
            stk = ss.accept();
            System.out.println("USER CONNECTED : "+count++);
            my = new myServer(stk);
            my.start();
        } while (true);
        }
        catch(Exception e){System.out.println("SERVER DOWN!");}
    }
}
