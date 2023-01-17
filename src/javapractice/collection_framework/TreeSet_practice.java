
package javapractice.collection_framework;

import java.util.TreeSet;
import java.util.NavigableSet;
public class TreeSet_practice {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(30);
        ts.add(250);
        ts.add(150);
        NavigableSet s = ts.descendingSet();
        System.out.println(ts);
        System.out.println(s);
    }
}
