
package javapractice;

public class swapping_using_bitwise {
    public static void main(String[] args) {
        byte a=9;
        byte b=8;
        byte d;
        byte c;
        c=(byte)a;
//        a=a^b;
//        b=a^b;
//        a=a^b;
        System.out.println(String.format("%s",Integer.toBinaryString(c)));
        d=(byte)(b<<4);
        d=(byte)(d|c);
        System.out.println(String.format("%s",Integer.toBinaryString(d)));
        
//        System.out.println(b);
    }
}
