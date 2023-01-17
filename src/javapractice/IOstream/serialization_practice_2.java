
package javapractice.IOstream;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;

public class serialization_practice_2 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/New folder/pp/text100.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        student s = new student();
        
        s.rollNo = 10;
        s.name = "SOMU SAXENA";
        s.dept = "IT";
        
        dos.writeInt(s.rollNo);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        
        dos.close();
        fos.close();
        
        FileInputStream fis = new FileInputStream("C:/New folder/pp/text100.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        student s1 = new student();
        s1.rollNo = dis.readInt();
        s1.name = dis.readUTF();
        s1.dept = dis.readUTF();
        
        System.out.println(s1.rollNo+" "+s1.name+" "+s1.dept);
        dis.close();
        fis.close();
    }
}
