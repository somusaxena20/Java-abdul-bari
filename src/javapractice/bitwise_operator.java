
package javapractice;


public class bitwise_operator {
    public static void main(String[] args) {
        int x= 0b1010;
        int y=0b1011;
        int z;
        z = x^y;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(String.format("%32s",Integer.toBinaryString(x)));
        System.out.println(String.format("%32s",Integer.toBinaryString(x)));
    }
}
