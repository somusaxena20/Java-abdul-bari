package javapractice.IOstream;

import java.io.ByteArrayInputStream;
import java.io.*;

public class ByteArrayInputStream_practice {
    public static void main(String[] args)throws Exception {
        
        byte b[] = {'a','b','c','d','e','f','g'};
        
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        
        int x;
        
        while((x=bis.read())!=-1)
        {
          System.out.print((char)x);
        }
        System.out.println();
        
        String s = new String();
        System.out.println(s);
        bis.close();
    }
}
