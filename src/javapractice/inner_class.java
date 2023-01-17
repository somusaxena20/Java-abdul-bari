 
package javapractice;
 
class outer
{
    static int x=10;
    class inner
    {
        int y=20;
        void innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerDisplay()
    {
        inner i = new inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
    
    
}

 abstract class my
 {
     abstract void sum();
 
 }

class outer1
{
    public void sum1()
    {
        my m1 = new my()
        {
            public void sum()
            {
                System.out.println("SUM");
            }
        };
        m1.sum();
    }
}

public class inner_class {
    public static void main(String[] args) {
//        outer o = new outer();
//        o.outerDisplay();
//        outer.inner i = new outer().new inner();
//        i.innerDisplay();
//        System.out.println(outer.x);

//        my m = new my()
//        {
//           void sum()
//           {
//               System.out.println("SUM");
//           }
//        };
//        m.sum();

        outer1 o = new outer1();
        o.sum1();

    }
}
