package javapractice.IOstream;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student implements Serializable
{
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    
    Student()
    {}
    Student(int a, String n, float f, String d)
    {
        this.name = n;
        this.rollNo = a;
        this.avg = f;
        this.dept = d;
    }
    
    public String toString()
    {
        return "ROLL NO : "+this.rollNo+"\nNAME : "+this.name+"\nAVERAGE : "+this.avg+"\nDEPARTMENT : "+this.dept;
    }
    
}

public class serialization_using_objectOutputStream_ObjectInputStream {

    public static void main(String[] args)throws Exception {
        
//        SERIALIZATION
        
        FileOutputStream fos = new FileOutputStream("C:/New folder/pp/object File.txt");
        ObjectOutputStream obj = new ObjectOutputStream(fos);
        
        Student s = new Student(10,"SOMU SAXENA",20.0f,"IT");
        
        obj.writeObject(s);
        
        
        obj.close();
        fos.close();
        
//        DE-SERIALIZATION

        FileInputStream fis = new FileInputStream("C:/New folder/pp/object File.txt");
        ObjectInputStream dis = new ObjectInputStream(fis);
        
        Student s1 = (Student)dis.readObject();
        System.out.println(s);
    }
}
