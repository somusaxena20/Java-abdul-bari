
package javapractice.collection_framework;

import java.util.StringTokenizer;
public class StringTokenizer_practice {
    public static void main(String[] args) {
        String s = "10=20=30=40=50";
        
        StringTokenizer stk = new StringTokenizer(s,",=");
        while(stk.hasMoreElements())
        {
            System.out.println(stk.nextToken());
        }
                
    }
}
