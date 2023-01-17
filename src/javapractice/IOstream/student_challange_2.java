
package javapractice.IOstream;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

class customer implements Serializable
{
    String cusID;
    String name;
    String phoneNO;
    
    static int count=1;
    
    
    customer(){}
    
    customer(String s, String p)
    {
        cusID = "C"+count++;
        name = s;
        this.phoneNO = p;
    }
    
    public String toString()
    {
        return "\nCUSTMER ID : "+this.cusID+"\nNAME : "+this.name+"\nPHONE NO : "+this.phoneNO;
    }
    
    
}

public class student_challange_2 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // WRITE OBJECT IN FILE
        
//        FileOutputStream fos = new FileOutputStream("C:/New folder/pp/student Challange/customer.txt");
//        ObjectOutputStream os = new ObjectOutputStream(fos);
//        DataOutputStream ds = new DataOutputStream(fos);
//        customer c[] = new customer[5];
//        ds.writeInt(c.length);
//            
//        for (int i = 0; i < c.length; i++) {
//            System.out.println("ENTER NAME : ");
//            String s = sc.nextLine();
//            System.out.println(s+" ENTER YOUR MOBILE NO : ");
//            String s1 = sc.nextLine();
//            c[i]= new customer(s,s1); 
//            os.writeObject(c[i]);    
//        }
//        
//        for(customer x : c)
//            System.out.println(x);
//        
//        os.close();
//        fos.close();

//        READ OBJECT FROM FILE

         FileInputStream fis = new FileInputStream("C:/New folder/pp/student Challange/customer.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         DataInputStream dis = new DataInputStream(fis);
         
         int length = dis.readInt();
         
        customer c[]=new customer[length];
        
        for(int i =0; i<length; i++)
        {
            c[i]=(customer)ois.readObject();
        }
        
        
        for(customer x : c)
            
            System.out.println(x);
        
        String search;
        System.out.println("ENTER SEARCH ID : ");
        search = sc.nextLine();
        
        for (int i = 0; i<length;i++) {
            if (search.equalsIgnoreCase(c[i].cusID)) {
                System.out.println(c[i]);
            }
        }
        
    }
}
