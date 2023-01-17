
package javapractice.network_programming;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket stk = new Socket("localhost",2000);
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;
        
        do {
            msg = keyb.readLine();
            ps.print(msg);
            msg = br.readLine();
            System.out.println("FROM SERVER : "+msg);
        } while (!msg.equals("dne"));
        
        stk.close();
    }
}
