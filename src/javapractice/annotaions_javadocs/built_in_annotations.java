
package javapractice.annotaions_javadocs;

@FunctionalInterface
interface verify1
{
    public void display();
}

class school implements verify1
{
    @Deprecated
    public void show()
    {
        
    }
    @Override
    public void display()
    {
        
    }
}
public class built_in_annotations {
    public static void main(String[] args) {
        school sc = new school();
        sc.show();
    }
}
