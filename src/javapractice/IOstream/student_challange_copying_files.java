
package javapractice.IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class student_challange_copying_files {
    public static void main(String[] args) {
//        try
//        {
//            FileInputStream first = new FileInputStream("C:/New folder/pp/Test.txt");
//            FileOutputStream second=new FileOutputStream("C:/New folder/pp/Test1.txt");
//            byte b[]=new byte[first.available()];
//            first.read(b);
//            String s = new String(b);
//            s=s.toLowerCase();
//            second.write(s.getBytes());
//            
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        
        try
        {
            FileInputStream first = new FileInputStream("C:/New folder/pp/Test.txt");
            FileInputStream second=new FileInputStream("C:/New folder/pp/Test1.txt");
            FileOutputStream s = new FileOutputStream("C:/New folder/pp/Destination.txt");
            SequenceInputStream sis = new SequenceInputStream(first, second);
            
            int x=0;
            
            while((x=sis.read())!=-1)
            {
                System.out.print((char)x);
            }
            
            
            
            while((x=sis.read())!=-1)
            {
                s.write(x);
            }
            first.close();
            second.close();
            s.close();
            sis.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
