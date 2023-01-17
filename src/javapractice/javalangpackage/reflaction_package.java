
package javapractice.javalangpackage;

import java.lang.reflect.*;

class my
{
    public int x;
    private String s;
    protected char a;
    boolean b;
    
    my()
    {
        
    }
    my(String s,char a,boolean b, int x)
    {
        this.a=a;
        this.b=b;
        this.s=s;
        this.x=x;
    }
    
    public void display()
    {
        
    }
    
    public void show()
    {
        
    }
    
}

public class reflaction_package {
    public static void main(String[] args) {
        Class c = my.class;
//        Field s[]=c.getDeclaredFields();
//        for(Field e : s)
//        {
//            System.out.println(e);
//        }
//        
//        System.out.println(c.getName());
//        
//        System.out.println(s[0].getName());
        
//        Constructor con[] = c.getConstructors();
//        
//        for(Constructor c1 : con)
//        {
//            System.out.println(c1);
//        }
        
//        Method meth[] = c.getMethods();
//        
//        for(Method m : meth)
//            System.out.println(m);
                    
        Constructor con[] = c.getDeclaredConstructors();
        
        for(Constructor c2 : con)
            System.out.println(c2);
                    
        
    }
}
