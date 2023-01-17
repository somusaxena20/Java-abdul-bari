
package javapractice.network_programming;

import java.net.*;
//import java.net.Socket;
import java.io.*;

public class ReverseEcho {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        
        do {
            msg = br.readLine();
            System.out.println("CLIENT REQUEST : "+msg);
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            System.out.println("RESPONSE TO CLIENT : "+msg);
            ps.println(msg);
            
        } while (msg.equals("dne"));
        
        stk.close();
    }
}
