package javapractice.lamda_expression;

@FunctionalInterface
interface myLamda {

    public void display();
}

@FunctionalInterface
interface addition
{
    public int add(int x, int y);
}

interface name
{
    public String n(String s);
}

interface student
{
    public String name();
}

public class lamdaExpression {

    public static void main(String[] args) {
        myLamda m =() -> {
            System.out.println("HELLO WORLD");
        };
        addition a = (x,y)->x+y;
   
        
        name n =(s)->s;
        student s =()->"SOMU SAXENA";
        m.display();
        System.out.println(a.add(20, 30));
        System.out.println(n.n("SOMU SAXENA"));
        System.out.println(s.name());
    }
}
