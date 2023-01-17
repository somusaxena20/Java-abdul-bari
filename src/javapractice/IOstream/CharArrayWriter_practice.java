
package javapractice.IOstream;

import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;

public class CharArrayWriter_practice {
    public static void main(String[] args)throws Exception {
        CharArrayWriter c = new CharArrayWriter(20);
        c.append('a');
        c.append('a');
        c.append('a');
        c.append('a');
        c.append('a');
        
        char ch[];
        
        c.writeTo(new FileWriter("C:/New folder/pp/file1.txt"));
        c.close();
    }
}
