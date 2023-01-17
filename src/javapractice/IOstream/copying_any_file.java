package javapractice.IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copying_any_file {

    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("C:/New folder/pp/Libaas.mp3");
        FileOutputStream fo = new FileOutputStream("C:/New folder/pp/copyLibaas.mp3");

        int x;
        while ((x = f.read()) != -1) {
            fo.write(x);
        }

        fo.close();
        f.close();
    }
}
