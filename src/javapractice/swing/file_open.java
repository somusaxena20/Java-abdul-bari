package javapractice.swing;

import java.io.File;
import java.awt.Desktop;

public class file_open {
    public static void main(String[] args)throws Exception {
        File file = new File("E:/ABDUL BARI JAVA/SECTION30-JAVA SWING/308.awt vs swing.ts");
        Desktop d = Desktop.getDesktop();
//        s = s.replace('\\', '/');
         d.open(file);
//        System.out.println(s);
        
    }
}
