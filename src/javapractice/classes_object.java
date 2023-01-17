
package javapractice;

import java.util.Scanner;



class student
{
    private int rollNo;
    private String name;
    private String course;
    private int m1,m2,m3,m4;
    
    public void setRollNo(int rollNo)
    {
        this.rollNo=rollNo;
    }
    public void showRollNo()
    {
        System.out.println("ROLL NUMBER : "+this.rollNo);
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void showName()
    {
        System.out.println("NAME : "+this.name);
    }
    public void setCourse(String course)
    {
        this.course=course;
    }
    public void showCourse()
    {
        System.out.println("COURSE : "+this.course);
    }
    public void setMarks(int m1,int m2,int m3,int m4)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        
    }
    public void showMarks()
    {
        System.out.println("HINDI : "+this.m1);
        System.out.println("ENGLISH : "+this.m2);
        System.out.println("MATHS: "+this.m3);
        System.out.println("PHYSICS : "+this.m4);
        System.out.println("TOTAL : "+(this.m1+this.m2+this.m2+this.m4));
        System.out.println("PERCENTAGE : "+(this.m1+this.m2+this.m2+this.m4)/4+"%");
    }
    
}

class banking
{
    private long accNo;
    private String name;
    public int balance;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAccountNo(long r)
    {
        this.accNo=r;
    }
    
    public void deposit(int amt)
    {
        System.out.println("YOU SUCCESSFULLY DEPOSIT "+amt+".00cr");
        this.balance=this.balance+amt;
    }
    public void withdrwal(int amt)
    {
        if(this.balance>amt){
        System.out.println("YOU SUCCESFULLY WIDTHDRWAL "+amt+".00cr");
        this.balance=this.balance-amt;
        }
        else
        {
            System.out.println("SORRY YOU DON'T HAVE ENOUGH AMOUNT");
        }
    }
    
    public void showDetails()
    {
        System.out.println("NAME : "+this.name);
        System.out.println("ACCOUNT NUMBER : "+this.accNo);
        System.out.println("BALANCE : "+this.balance+".00cr");
    }
    
}

public class classes_object {
    public static void main(String[] args) {
        
//        student s = new student();
//        s.setRollNo(1101);
//        s.setName("SOMU SAXENA");
//        s.setCourse("INFORMATION  TECHNOLOGY");
//        s.setMarks(40, 50, 60, 70);
//        s.showRollNo();
//       s.showName();
//       s.showCourse();
//       s.showMarks();

        banking b = new banking();
        
        b.setAccountNo((3436564));
        b.setName("SOMU SAXENA");
        
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.print(" 1 : BALANCE\n 2 : WITHDRAWAL\n 3 : DEPOSIT\n 4 : EXIT\n");
            switch(sc.nextInt())
            {
                case 1:
                    b.showDetails();
                    break;
                case 2:
                    System.out.println("ENTER AMOUNT");
                    b.withdrwal(sc.nextInt());
                    break;
                case 3:
                    System.out.println("ENTER AMOUNT");
                    b.deposit(sc.nextInt());
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }
}
