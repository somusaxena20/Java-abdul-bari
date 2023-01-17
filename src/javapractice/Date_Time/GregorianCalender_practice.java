
package javapractice.Date_Time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalender_practice {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.getCalendarType());
        
    }
}
