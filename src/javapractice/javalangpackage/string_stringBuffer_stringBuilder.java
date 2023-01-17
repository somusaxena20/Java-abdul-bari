
package javapractice.javalangpackage;


public class string_stringBuffer_stringBuilder {
    public static void main(String[] args) {
        String s = "HELLO";
        
        StringBuffer b = new StringBuffer("HELLO");
        StringBuilder b1 = new StringBuilder("HELLO");
        s.concat("WORLD");
        b.append("WORLD");
        b1.append("WORLD");
        System.out.println(s);
        System.out.println(b);
        System.out.println(b1);
    }
}
