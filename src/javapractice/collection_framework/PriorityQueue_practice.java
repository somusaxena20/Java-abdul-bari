
package javapractice.collection_framework;

import java.util.PriorityQueue;
import java.util.Comparator;

//for changing the priority

class myCom implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2)
    {
        if (o1<o2) {
            return 1;
        }
        if (o1>o2) {
            return -1;
        }
        return 0;
    }
}

public class PriorityQueue_practice {
    public static void main(String[] args) {
        
//   which object you want gets that priority so pass that comparator class object
        PriorityQueue<Integer> pq = new PriorityQueue<>(new myCom());
        
        
        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(12);
        pq.add(3);
        pq.add(6);
        
//        delete by giving object from any object 
        System.out.println(pq.remove(6));
        System.out.println("SIZE : "+pq.size());
        
        pq.forEach((x)->System.out.println(x));
    }
}
