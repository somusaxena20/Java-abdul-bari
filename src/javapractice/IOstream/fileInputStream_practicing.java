
package javapractice.IOstream;

import java.io.FileInputStream;
import java.io.FileReader;

public class fileInputStream_practicing {
    public static void main(String[] args) {
    
        try(FileInputStream f = new FileInputStream("C:/New folder/pp/Test1.txt"))
        {
            byte b[] = new byte[f.available()];
            f.read(b);
            String s = new String(b);
            System.out.println(s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        try(FileReader fr = new FileReader("C:/New folder/pp/Test1.txt"))
        {
            //give size of char array
            
            char c[]=new char[100];
            fr.read(c);
            String s = new String(c);
            System.out.println(s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
