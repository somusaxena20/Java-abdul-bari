package javapractice.exceptionhandling;

import java.util.Scanner;

public class try_catch {

    public static void main(String[] args) {
        int a, b, c;
        int A[] = {10,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A : ");
        a = sc.nextInt();
        System.out.println("ENTER B : ");
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println(c);
//            A[6]=10;
            System.out.println("END OF A PROGRAM");
        }
        
        catch (ArithmeticException e) {
            System.out.println("EXCEPTION NAME IS : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ARRAY INDEX YOU WANT TO ACCESS IS NOT AVALABLE : "+e);
        }
        
        
    }

}
