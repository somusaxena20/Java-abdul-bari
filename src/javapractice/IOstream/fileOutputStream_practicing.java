package javapractice.IOstream;

import java.io.*;

public class fileOutputStream_practicing {

    public static void main(String[] args) {

        
        try {
            FileOutputStream f = new FileOutputStream("C:/New folder/pp/Test.txt");
            String str="JAVA IS PROGRAMMING LANGUAGE";
            byte b[]=str.getBytes();
            f.write(b);
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //try with resource
        
        try(FileOutputStream fs = new FileOutputStream("C:/New folder/pp/test1.txt"))
        {
            String s = "JAVA IS OBJECT ORIENTED PROGRAMMING";
            fs.write(s.getBytes());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
