
package javapractice.IOstream;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class producer extends Thread
{
    OutputStream os;
    
    producer(OutputStream o){this.os = o;}
    
    @Override
    public void run()
    {
        int count = 1;
        while(true)
        {
            try
            {
                os.write(count);
                os.flush();
                System.out.println("PRODUCER : "+count);
                count++;
                Thread.sleep(10);
            }
            catch(Exception e){}
        }
    }
    
}

class consumer extends Thread
{
    InputStream ip;
    
    consumer(InputStream i){this.ip = i;}
    
    @Override
    public void run()
    {
        int x;
        while(true)
        {
            try
            {
                x=ip.read();
                System.out.println("CONSUMER :  "+x);
//                Thread.sleep(10);
                System.out.flush();
            }catch(Exception e){}
        }
    }
    
}

public class PipedStream_practice {
    public static void main(String[] args)throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        
        pis.connect(pos);
        
        producer p = new producer(pos);
        consumer c = new consumer(pis);
        
        p.start();
        c.start();
        
    }
}
