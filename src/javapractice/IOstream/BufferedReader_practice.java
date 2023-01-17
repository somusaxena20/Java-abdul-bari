
package javapractice.IOstream;

import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReader_practice {
    public static void main(String[] args)throws Exception {
        FileReader fr = new FileReader("C:/New folder/pp/test1.txt");
        BufferedReader br = new BufferedReader(fr);
        
//        CHECKING WHOSE SUPPORT THE MARK
        
//        System.out.println(fr.markSupported());
//        System.out.println(br.markSupported());
        
        br.mark(10);
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.reset();
        System.out.println();
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.println((char)br.read());
        br.reset();
        System.out.println(br.readLine());
        


        br.close();
        fr.close();
        
        
    }
}
