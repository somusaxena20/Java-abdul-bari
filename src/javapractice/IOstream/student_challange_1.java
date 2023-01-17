
package javapractice.IOstream;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;


public class student_challange_1 {
    public static void main(String[] args)throws Exception {
        
//        PUT DATA INTO FILE
        
        FileOutputStream fo = new FileOutputStream("C:/New folder/pp/student Challange/float.txt");
        DataOutputStream dos = new DataOutputStream(fo);
        
        float arr[] = {10.2f,20.3f,45.7f,99.9f};
        
        dos.writeInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            dos.writeFloat(arr[i]);
        }
        
        
        dos.close();
        fo.close();
        
//        RETRIVE DATA FROM FILE

        FileInputStream fi = new FileInputStream("C:/New folder/pp/student Challange/float.txt");
        DataInputStream dis = new DataInputStream(fi);
        
        int size = dis.readInt();
        
        float f[] = new float[size];
        
        for (int i = 0; i < size; i++) {
            f[i]=dis.readFloat();
        }

        for(float p : f)
            System.out.println(p);
        
        dis.close();
        fi.close();
    }
}
