
package javapractice.collection_framework;

import java.util.BitSet;

public class BitSet_practice {
    public static void main(String[] args) {
        BitSet b1 = new BitSet(4);
        b1.set(1);
        BitSet b2 = new BitSet(4);
        b2.set(3);
        
        System.out.println(b1.get(0)+""+b1.get(1)+""+b1.get(2)+""+b1.get(3));
        System.out.println(b2.get(0)+""+b2.get(1)+""+b2.get(2)+""+b2.get(3));
        
        b1.xor(b2);
        b2.xor(b1);
        b1.xor(b2);
        
        System.out.println(b1.get(0)+""+b1.get(1)+""+b1.get(2)+""+b1.get(3));
        System.out.println(b2.get(0)+""+b2.get(1)+""+b2.get(2)+""+b2.get(3));
    }
}
