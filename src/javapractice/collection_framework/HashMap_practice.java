
package javapractice.collection_framework;

import java.util.HashMap;

public class HashMap_practice {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "SOMU");
        hm.put(1, "SOMU");
        hm.put(10, "AMUL");
        hm.put(4,"SHASHANK");
        
        
        hm.forEach((x,y)->System.out.println("KEY : "+x+" VALUE : "+y));
        
        
    }
}
