package javapractice.IOstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStream_practice {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/New folder/pp/test1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

//        System.out.println(fis.markSupported());
//        System.out.println(bis.markSupported());
//        using buffered input stream
//        bis.mark(10);
//        System.out.print((char)bis.read());
//        System.out.print((char)bis.read());
//        System.out.print((char)bis.read());
//        System.out.print((char)bis.read());
//        bis.reset();
//        System.out.println();
//        System.out.print((char)bis.read());
//        System.out.print((char)bis.read());
//        System.out.print((char)bis.read());
//        System.out.print((char)bis.read());
        
//        using FileInputStream we cannot mark and reset so this means it not supported buffered

//        fis.mark(10);
//        System.out.print((char) fis.read());
//        System.out.print((char) fis.read());
//        System.out.print((char) fis.read());
//        System.out.print((char) fis.read());
//        fis.reset();
//        System.out.println();
//        System.out.print((char) fis.read());
//        System.out.print((char) fis.read());
//        System.out.print((char) fis.read());
//        System.out.print((char) fis.read());

        bis.close();
        fis.close();

    }
}
