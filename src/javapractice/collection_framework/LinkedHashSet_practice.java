
package javapractice.collection_framework;

import java.util.LinkedHashSet;

public class LinkedHashSet_practice {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        
//        IT IS BASED ON A INSERTION ORDER
        
        l.add(100);
        l.add(10);
        l.add(20);
        l.add(10);
        
        
        System.out.println(l);
        
    }
}
