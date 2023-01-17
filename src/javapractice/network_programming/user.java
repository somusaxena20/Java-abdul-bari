

package javapractice.network_programming;

import java.net.*;
import java.io.*;
public class user {
    public static void main(String[] args)throws Exception {
        Socket s = new Socket("localhost",2021);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bs = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());
        String msg;
        System.out.println("SERVER CONNECTED...");
        do {
           msg = br.readLine();
           ps.println(msg);
           msg = bs.readLine();
            System.out.println("MASSAGE : "+msg);
        } while (!msg.equals("dne"));
        s.close();
    }
}
