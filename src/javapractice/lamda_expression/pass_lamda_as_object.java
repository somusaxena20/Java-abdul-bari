
package javapractice.lamda_expression;

interface myLamda1
{
    public void display();
}

class lamda
{
    public void callLamda(myLamda1 m)
    {
        m.display();
    }
}

public class pass_lamda_as_object {
    public static void main(String[] args) {
        lamda l = new lamda();
        l.callLamda(()->{System.out.println("SOMU SAXENA");});
    }
}
