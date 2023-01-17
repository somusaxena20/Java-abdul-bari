

package javapractice.exceptionhandling;


public class AgeNegativeException extends Exception{

    AgeNegativeException(String s)
    {
        toString(s);
    }
    
    public String toString()
    {
        return "AGE CANNOT BE NEGATIVE";
    }
    public String toString(String s)
    {
        return s;
    }
    
}
