
package javapractice.IOstream;

import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStream_practicing {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/New folder/pp/global.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        fos.write('a');
        fos.write('a');
        fos.write('a');
        fos.write('a');
        
        
        bos.close();
        fos.close();
    }
}
