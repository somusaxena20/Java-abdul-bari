
package javapractice.java_Genrics;

//1ST EXAMPLE

class data<T>
{
    T id;
    
    public void setId(T x)
    {
        this.id = x;
    }
    public T getId()
    {
        return this.id;
    }
}

//2ND EXAMPLE

class myArray <T>
{
    T arr[] = (T[])new Object[5];
    int length=0;
    
    public void append(T x)
    {
        arr[length++]=x;
    }
    public void display()
    {
        for(int i = 0;i<length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class example_genrics {
    public static void main(String[] args) {
       
//        1ST EXAMPLE
        
        data  s = new data();
        
        s.setId("SOMU SAXENA");
        System.out.println(s.getId());
        
//        2ND EXAMPLE
        
        myArray<Integer> a = new myArray<>();
        a.append(10);
        a.append(10);
        a.append(10);
        a.display();
        
        
    }
}
