package javapractice.collection_framework;

import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Properties_practice {

    public static void main(String[] args) {
        Properties p = new Properties();
        
//        SETTING THE PROPERTIES 
        
//        p.setProperty("NAME", "SOMU SAXENA");
//        p.setProperty("BRANCH", "IT");
//        p.setProperty("SEMESTER", "7TH");
//        p.setProperty("ROLL NUMBER", "0225IT181057");

//        STORE THE DATA INTO FILE 
        
//        try {
//            p.store(new FileOutputStream("C:/New folder/pp/properties.txt"), "STUDENT 1");
//            p.storeToXML(new FileOutputStream("C:/New folder/pp/properties.xml"), "STUDENT 1");
//        } catch (FileNotFoundException e) {
//        } catch (IOException e) {
//        }
//        System.out.println(p.getProperty("NAME"));

//       RETRIVE THE DATA FROM FILES

        try
        {
//            p.load(new FileInputStream("C:/New folder/pp/properties.txt"));
            p.loadFromXML(new FileInputStream("C:/New folder/pp/properties.xml"));
            System.out.println(p);
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}
        
    }
}
