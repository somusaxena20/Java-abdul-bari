
package javapractice.collection_framework;

import java.util.Arrays;
import java.util.Comparator;

class my implements Comparator<Integer>
{
    @Override
    public int compare(Integer i, Integer j)
    {
        if(i<j)return -1;
        if(i>j)return 1;
        return 0;
    }
}
        
public class Array_practice {
    public static void main(String[] args) {
        Integer a[] = {5,3,7,4,6};
        
        
        Arrays.sort(a, new my());
        
        for(int x: a)
            System.out.printf("%d    ",x);
        
        System.out.println();
        
        
    }
}
