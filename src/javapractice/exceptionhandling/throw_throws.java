package javapractice.exceptionhandling;

class cal {

    public int meth2(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new ArithmeticException();
        }
        return l * b;
    }

    public void meth1() throws Exception {
        int c;
        c = meth2(10, -1);
        System.out.println(c);
    }
}

public class throw_throws {

    public static void main(String[] args) {
        cal c = new cal();
        try {
            c.meth1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
