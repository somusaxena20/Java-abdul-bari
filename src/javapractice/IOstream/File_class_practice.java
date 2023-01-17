
package javapractice.IOstream;

import java.io.File;

public class File_class_practice {
    public static void main(String[] args)throws Exception {
        File f = new File("C:/New folder/pp/text10.txt");
        File f1 = new File("C:/New folder/pp/text100.txt");
        System.out.println(f.createNewFile());
        System.out.println(f.getName());
        System.out.println(f.renameTo(f1));
        System.out.println(f.setReadOnly());
        System.out.println(f.canWrite());
        System.out.println(f.setWritable(true));
        System.out.println(f.canWrite());
        System.out.println(f.toURL());
        System.out.println(f.getFreeSpace());
        System.out.println(f.setExecutable(true));
        System.out.println(f.isDirectory());
        System.out.println(f.toPath());
    }
}
