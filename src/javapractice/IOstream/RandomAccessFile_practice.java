
package javapractice.IOstream;

import java.io.RandomAccessFile;

public class RandomAccessFile_practice {
    public static void main(String[] args)throws Exception {
        RandomAccessFile f = new RandomAccessFile("C:/New folder/pp/text2.txt","rw");
        f.write('a');
        f.write('b');
        f.write('c');
        f.write('d');
        f.write('e');
        f.write('f');
        f.write('g');
        f.writeInt(10);
        f.seek(0);
        System.out.println((char)f.read());
        System.out.println(f.getFilePointer());
        System.out.println((char)f.readInt());
        System.out.println(f.length());
    }
}
