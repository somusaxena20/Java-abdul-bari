
package javapractice.IOstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class student
{
    int rollNo;
    String name;
    String dept;
}

public class serialization_practice {
    public static void main(String[] args)throws Exception {
        FileOutputStream f = new FileOutputStream("C:/New folder/pp/text100.txt");
        PrintStream ps = new PrintStream(f);
        student s = new student();
        s.rollNo = 10;
        s.name = "SOMU SAXENA";
        s.dept = "IT";
        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);
        
        FileInputStream fo = new FileInputStream("C:/New folder/pp/text100.txt");
        BufferedReader bs = new BufferedReader(new InputStreamReader(fo));
        
        student s1 = new student();
        s1.rollNo = Integer.parseInt(bs.readLine());
        s1.name = bs.readLine();
        s1.dept = bs.readLine();
        
         System.out.println("ROLL NO : "+s1.rollNo+"\nNAME : "+s1.name+"\nDEPT : "+s1.dept);
        
    }
}
