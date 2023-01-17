
package javapractice.network_programming;

import java.net.*;


public class DatagramCilent {
    public static void main(String[] args)throws Exception {
        
//        CREATE DATAGRAM SOCKET
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "somu";
//        CREATE DATAGRAM PACKET 
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
        ds.send(dp); //SEND DATAGRAM PACKET USING DATAGRAM SOCKET 
        
        byte b[] = new byte[1024];
        
        dp = new DatagramPacket(b,1024);
        ds.receive(dp);
        
        msg = new String(dp.getData()).trim();
        System.out.println("FROM SERVER : "+msg);
        
        ds.close();
    }
}
