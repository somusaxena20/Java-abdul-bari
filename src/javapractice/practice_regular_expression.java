 
package javapractice;
 
public class practice_regular_expression {
    public static void main(String[] args) {
        
        String str = "20/07/2000";
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
