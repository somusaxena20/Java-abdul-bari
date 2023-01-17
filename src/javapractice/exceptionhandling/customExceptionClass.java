

package javapractice.exceptionhandling;


import java.lang.RuntimeException;
import java.util.Scanner;
import javapractice.exceptionhandling.NegativeDimensionException;
import javapractice.exceptionhandling.AgeNegativeException;


class FileNotPresent extends RuntimeException
{
//    FileNotPresent(String s)
//    {
//        toString(s);
//    }
    public String toString()
    {
        return "FILE NOT FOUND";
    }
    public String toString(String s)
    {
        return s;
    }
}


class calculate
{
    
    public void meth2(int l, int b)throws NegativeDimensionException
    {
        if (l<0 || b<0) {
            throw new NegativeDimensionException();
        }
        System.out.println((float)l/b);
    }
    
    public void meth1(int a, int b)throws NegativeDimensionException
    {
        meth2(a,b);
    }
}

class validateAge
{
    public void vote(int a)throws AgeNegativeException
    {
        if (a<0) {
            throw new AgeNegativeException("SHAME ON YOU");
        }
        if (a>=18) {
            System.out.println("YOU ARE ELIGIBLE FOR VOTING");
        }
        else
        {
            System.out.println("YOUR ARE NOT ELIGIBLE FOR VOTING");
        }
    }
}

class video
{
    public void check(int a)
    {
        if (a<0) {
            throw new FileNotPresent();
        }
        System.out.println(a);
    }
}


public class customExceptionClass {

    public static void main(String[] args)throws NegativeDimensionException,AgeNegativeException {
        
        Scanner sc = new Scanner(System.in);
        
//        calculate c = new calculate();
//        
//        System.out.println("ENTER DIMENSIONS : ");
//        
//        c.meth1(sc.nextInt(),sc.nextInt());
//
//            
//        System.out.println("ENTER THE AGE : ");
//            validateAge age = new validateAge();
//            age.vote(sc.nextInt());

            video v = new video();
            System.out.println("ENTER VALUE : ");
            v.check(sc.nextInt());


    }
    
}
