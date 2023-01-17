
package javapractice.collection_framework;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList_practice {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(98);
        l2.add(50);
        l2.add(200);
        l1.add(10);
        l1.addFirst(5);
        System.out.println(l1.element());
        l1.offer(50);
        l1.offerFirst(100);
        l1.offerLast(200);
        l1.poll();
        l1.pollFirst();
        l1.pop();
        l1.push(85);
        l1.set(0, 98);
        System.out.println(l1.equals(l2)) ;
        Object l3 = l1.clone();
        System.out.println("SIZE : "+l1.size());
        System.out.println("PRINT LINKED LIST : ");
        l1.forEach(n->System.out.println(n));
        
        System.out.println(l3);
        System.out.println(l1);
        List  l4 = l1.subList(1, 2);
        System.out.println(l4);
        
//        FOR REVERSE PRINTING
        
        Iterator <Integer> i = l1.descendingIterator();
        
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
        
        
        
        
        
    }
}
