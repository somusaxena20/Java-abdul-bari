
package javapractice.awt;

import  java.time.Month;

public class demo {
    public static void main(String[] args) {
        Month m[] = Month.values();
        
        for(Month x : m)
        {
            System.out.println(x);
        }
    }
}
