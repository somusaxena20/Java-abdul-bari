package javapractice.exceptionhandling;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b;
        int A[] = new int[5];
        System.out.println("ENTER A AND B : ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        try
        {
        
        int c = a/b;
        System.out.println(c);
        try
        {
            System.out.println(A[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
