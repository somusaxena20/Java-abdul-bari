
package javapractice.Date_Time;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZons_practice {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        TimeZone t = gc.getTimeZone();
        
        String s[] = TimeZone.getAvailableIDs();
        
        for(String x : s)
            System.out.println(x);
        System.out.println(t);
    }
}
