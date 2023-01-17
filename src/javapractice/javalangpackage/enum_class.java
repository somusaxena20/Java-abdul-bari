
package javapractice.javalangpackage;

import java.util.Scanner;

enum Dept
{
    CS("SUMIT NEMA","BLOCK A"),IT("VANDHANA PAHTAK","BLOCK B"),CIVIL("SANDEEP RAO","BLOCK C"),EC("VIVEK AWASTI","BLOCK D");
    
    String head;
    String location;
    
    private Dept(String s, String h)
    {
        this.head=s;
        this.location=h;
    }
    
    public void display()
    {
        System.out.println("HOD : "+this.head+"  LOCATION : "+this.location);
    }
    
}

public class enum_class {
    public static void main(String[] args) {
        Dept d[] = Dept.values();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER NUMBER : ");
        switch(d[sc.nextInt()])
        {
            case CS:
                d[0].display();
                break;
            case IT:
                d[1].display();
                break;
            case CIVIL:
                d[2].display();
                break;
            case EC:
                d[3].display();
                break;
        }
    }
}
