
package javapractice.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayList_practice {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(20);
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a2.add(60);
        a2.add(70);
        a2.add(80);
        a2.add(90);
        a2.add(100);
        System.out.println(a1);
        a1.addAll(a2);
        a1.removeAll(a2);
        a1.addAll(0, a2);
        System.out.println(a1.isEmpty());
       
        System.out.println(a1);
        System.out.println(a2);
       
//        CONVERT LIST INTO A ARRAY
        
        Object a[] = a1.toArray();
        for(Object x : a)
            System.out.println(x);
        
        System.out.println("SIZE : "+a1.size());
        try
        {
            a1.add(10, 210);
        }
        catch(Exception e){System.out.println("PLEASE ENTER VALID INDEX");}
        System.out.println(a1);
        
        System.out.println(a1.get(5));
        
        Iterator <Integer> i = a1.iterator();
        
//        1ST METHOD USING ITERATOR
        
        System.out.println("USING ITERATOR");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
//        2ND METHOD USING ITERATOR USING FOR LOOP
        System.out.println("2ND METHOD USING ITERATOR USING FOR LOOP");
        
        for(Iterator <Integer> i1 = a1.iterator();i1.hasNext();)
            System.out.println(i1.next());
        
        System.out.println("USING FOR EACH METHOD USING LAMDA EXPRESSION");
        
        a1.forEach(n->System.out.println(n));
        
        System.out.println("USING FOR EACH METHOD USING SYSTEM.OUT AS REFRENCE AND PRINTLN AS METHOD");
        
        a1.forEach(System.out::println);
//         3RD METHOD USING LISTITERATOR 

        ListIterator<Integer> li = a1.listIterator();
        
//        using list iterator method forEachRemaining

        System.out.println("using list iterator method forEachRemaining");
        
        li.forEachRemaining(System.out::println);
       
        System.out.println("LIST ITERATOR USING FOR LOOP");
        for(li=a1.listIterator();li.hasNext();)
        System.out.println(li.next());
        
        
        
    }
}
