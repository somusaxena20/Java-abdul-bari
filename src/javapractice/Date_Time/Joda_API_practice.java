
package javapractice.Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Joda_API_practice {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.atStartOfDay());
        System.out.println(d.lengthOfYear());
        
        LocalTime t = LocalTime.now();
        System.out.println(t);
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
    }
}
