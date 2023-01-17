 
package javapractice;

 
public class student_challenge_email {
    public static void main(String[] args) {
        String str = "somusaxena20@gmail.com";
        int x = str.indexOf("@");
        int y = str.indexOf(".");
        
        String domain = str.substring(x+1,y);
        String uname = str.substring(0, x);
        System.out.println(domain.equals("gmail"));
        System.out.println(domain);
        System.out.println(uname);
    }
}
