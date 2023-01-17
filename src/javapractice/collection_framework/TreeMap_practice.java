
package javapractice.collection_framework;

import java.util.TreeMap;
import java.util.SortedMap;

public class TreeMap_practice {
    public static void main(String[] args) {
        
        
        
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(10, "SOMU");
        tm.put(1,"AMUL");
        
        SortedMap<Integer,String> s = tm.subMap(0, 2);
        
        TreeMap<Integer,String> ts = new TreeMap<>(s);
        
        System.out.println(ts.lastEntry());
        
        ts.forEach((x,y)->System.out.println("KEY : "+x+" VALUE : "+y));
        
        
        tm.forEach((x,y)->System.out.println("KEY : "+x+" VALUE : "+y));
    }
}
