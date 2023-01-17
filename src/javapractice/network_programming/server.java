
package javapractice.network_programming;

import java.net.*;
import java.io.*;


public class server extends Thread {
    Socket stk;
    public server(Socket s){this.stk = s;}
    
    @Override
    public void run()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());
            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
            } while (!msg.equals("dne"));
            stk.close();
        }catch(Exception e){}
    }
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        System.out.println("SERVER STARTED...");
        Socket stk;
        server re;
        int count = 1;
        do {
            stk = ss.accept();
            System.out.println("CLIENT CONNECTED : "+count++);
            re = new server(stk);
            re.start();
        } while (true);
        
    }
}
