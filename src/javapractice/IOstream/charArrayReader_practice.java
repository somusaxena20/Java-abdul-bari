
package javapractice.IOstream;

import java.io.CharArrayReader;

public class charArrayReader_practice {
    public static void main(String[] args)throws Exception {
        
        char b[] = {'a','b','c','d','e','f','g','h'};
        
        CharArrayReader c = new CharArrayReader(b);
        int x;
        
        while((x=c.read())!=-1)
            System.out.println((char)x);
        
        c.close();
        
    }
}
