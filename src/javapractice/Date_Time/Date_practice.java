
package javapractice.Date_Time;

import java.util.Date;

public class Date_practice {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime()/1000/60/60/24/365);
        System.out.println(d.getDate()+"-"+d.getMonth()+"-"+(d.getYear()+1900));
        System.out.println(d.toLocaleString());
        System.out.println(d.toString());
    }
}
