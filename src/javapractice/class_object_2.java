 
package javapractice;

 
class rectangle
{
    private double l;
    private double b;
    public double area()
    {
        return l*b;
    }
    public boolean isSquare()
    {
        return l==b;
    }
    public String toString()
    {
        return "area : "+area()+"";
    }
}

class cylinder
{
    public double radius; 
}

public class class_object_2 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
       
        System.out.println("AREA : "+r.area());
        System.out.println("IS SQARE : "+r.isSquare());
        System.out.println(r);
    }
}
