

package javapractice.exceptionhandling;


public class checked_unchecked_exception {

    static int meth2(int a, int b)
    {
        return a/b;
    }
    
    static void meth1()
    {
        System.out.println(meth2(10,0));
    }
    
    public static void main(String[] args) {
       
        try
        {
        meth1();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
//        int c;
//        try
//        {
//        c = 10/0;
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
    
}
