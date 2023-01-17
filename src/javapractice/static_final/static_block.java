 
package javapractice.static_final;

class test
{
    static
    {
        System.out.println("BLOCK 1");
    }
    static
    {
        System.out.println("BLOCK 2");
    }
}

public class static_block {
    public static void main(String[] args) {
        System.out.println("MAIN 1");
        test t = new test();   // load the class by creating the object
        System.out.println("MAIN 1");
    }
}
