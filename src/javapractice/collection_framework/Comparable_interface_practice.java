
package javapractice.collection_framework;

import java.util.TreeSet;

class point implements Comparable
{
    int x;
    int y;
    
    point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int compareTo(Object o)
    {
        point p = (point)o;
        
        if(this.x > p.x)
            return 1;
        else if(this.x < p.x)
            return -1;
        else
        {
            if (this.y > p.y) {
                return 1;
            }
            else if (this.y < p.y) {
                return -1;
            }
            else
                return 0;
        }
        
    }
    
    @Override
    public String toString()
    {
        return "x = "+this.x+" "+"y = "+this.y;
    }
    
}
       

public class Comparable_interface_practice {
    public static void main(String[] args) {
        TreeSet<point> p = new TreeSet<>();
        p.add(new point(10,20));
        p.add(new point(80,20));
        p.add(new point(12,20));
        p.add(new point(9,20));
        
        
        
        System.out.println(p.first());
        
        System.out.println(p);
        
        
        
        
    }
}
