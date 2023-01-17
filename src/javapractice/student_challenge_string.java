 
package javapractice;
 
public class student_challenge_string {
    public static void main(String[] args) {
        String str = "    abc123def123xyz123abc123pqrst   ";
        str = str.replaceAll("[^\\D]+"," ").trim();
        
        System.out.println(str);
//        String s1[] = str.split("\\s");
//        System.out.println(s1[4]);
    }
}
