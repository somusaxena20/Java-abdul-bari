package javapractice.lamda_expression;

import java.util.Date;

interface method {

    public void display(String s);
}

interface method1 {

    public StringBuffer re(String s);
}

interface time {

    public void showTime();
}

interface compare {

    public int eq(String s1, String s2);
}

public class method_refrence {

    method_refrence() {
        System.out.println("I AM CONSTRUCTOR");
    }

    public void show(String s) {
        System.out.println(s);
    }

    public StringBuffer reverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb;
    }

    public void time() {
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    }

    public static void main(String[] args) {
        method_refrence l = new method_refrence();
        method m = l::show;
        method1 m1 = l::reverse;
        time t = l::time;
        m.display("SOMU SAXENA");
        System.out.println(m1.re("SOMU SAXENA"));
        t.showTime();
        time t1 = method_refrence::new;
        compare cp = String::compareTo;
        System.out.println(cp.eq("SOMU", "SOMU"));
    }
}
