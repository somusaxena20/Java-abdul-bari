 
package javapractice.static_final;

 class s
 {
     static int a =10;
     int b=10;
 }
public class static_class {
    public static void main(String[] args) {
        s s1 = new s();
        s s2 = new s();
        System.out.println(s1.a);
        System.out.println(s2.a);
        s1.a=20;
        System.out.println(s1.a);
        System.out.println(s2.a);
        System.out.println(s.a);
        
    }
}
