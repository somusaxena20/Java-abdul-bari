package javapractice.annotaions_javadocs;

import java.lang.annotation.*;
import java.util.Date;

//@Retention(RetentionPolicy.CLASS)
//@Documented
//@Target(value={ElementType.METHOD,ElementType.class})
@interface myAnno
{
    String name();
    String date();
    String version();
}

class my1
{
    
}

@myAnno(name="SOMU",date="12/14/2021",version="1.23")
public class user_defined_annotation {
    public static void main(String[] args)
    {
        
    }
}
