

package javapractice.swing;

import java.text.DateFormatSymbols;

public class days {
    public static void main(String[] args) {
        String s[] = new DateFormatSymbols().getShortWeekdays();
        for(String x : s)
        {
            System.out.println(x);
        }
    }
}
