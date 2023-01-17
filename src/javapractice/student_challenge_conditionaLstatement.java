 
package javapractice;
 
import java.util.Scanner;

public class student_challenge_conditionaLstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        int a = sc.nextInt();
        
        if(a%2==0)
        {
            System.out.println("NUMBER IS EVEN = "+a);
        }
        else
        {
            System.out.println("NUMBER IS ODD = "+a);
        }
    }
}
