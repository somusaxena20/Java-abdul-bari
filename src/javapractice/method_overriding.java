
package javapractice;

class a
{
    
}
class b extends a
{
    
}

class super1
{
    public void display()
    {
        System.out.println("HELLO");
        
    }
    public void display1()
    {
        System.out.println("HELLO 1");
    }
    
}

class sub1 extends super1
{
    public void display1()
    {
        System.out.println("WELCOME 1");
        
    }
     public  void display()
    {
        System.out.println("WELCOME");
        
    }
    public void display2()
    {
        System.out.println("HELLO");
    }
}


public class method_overriding {
        public static void main(String[] args) {
            
            super1 s1 = new super1();
            s1.display();
            
            sub1 s2 = new sub1();
            s2.display();
            
            
            
//         DYNAMIC METHOD DISPATCH

           super1 s = new sub1();
           s.display1();
    }
}
