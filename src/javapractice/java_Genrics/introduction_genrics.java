
package javapractice.java_Genrics;


class genrics<T>
{
    T data[]=(T[])new Object[3];
}

public class introduction_genrics {
    public static void main(String[] args) {
        
        // WHEN GENRICS WAS NOT INTRODUCED SO USE LIKE IT
        
//        Object obj = new Integer(10); //ERROR : INT CANNOT CONVERT INTO STRING
//        String s = (String)obj;
//        System.out.println(s);

         genrics<String> g= new genrics();
         g.data[0]="10";
         g.data[1]="BYE";
         
    }
}
