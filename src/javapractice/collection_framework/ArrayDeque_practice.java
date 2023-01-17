
package javapractice.collection_framework;

import java.util.ArrayDeque;

public class ArrayDeque_practice {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        
        ad1.addFirst(150);
        ad1.addFirst(140);
        ad1.addFirst(190);
        ad1.addFirst(170);
        
        ad.addFirst(50);
        ad.addFirst(40);
        ad.addFirst(90);
        ad.addFirst(70);
        
        ad.addLast(100);
        ad.addAll(ad1);
        ad.removeAll(ad1);
        System.out.println(ad.removeLastOccurrence(100));
        ad.forEach((x)->System.out.println(x));
        
        
    }
}
