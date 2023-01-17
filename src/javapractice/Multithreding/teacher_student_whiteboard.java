
package javapractice.Multithreding;

class whiteBoard
{
    String text;
    int noOfStudents;
    int count =0;
     
    public void attendance()
    {
        this.noOfStudents++;
    }
    
    synchronized public void write(String s)
    {
        System.out.println("TEACHER IS WRITING : "+s);
        while(count != 0)
            try{wait();}catch(InterruptedException e){}
        this.text = s;
        this.count = this.noOfStudents;
        notifyAll();
    }
    
    synchronized public String read()
    {
        while(count == 0)
            try{wait();}catch(InterruptedException e){}
        String t = this.text;
        count--;
        if (count==0) {
            notify();
        }
        return t;
    }
    
}

class teacher extends Thread
{
    whiteBoard b;
    String notes[]={"JAVA IS PROGRAMMING LANGUAGE","JAVA SUPPORTS OOPS","JAVA SUPPORTS MULTITHREADING","END"};
    teacher(whiteBoard b)
    {
        this.b = b;
    }
    
    @Override
    public void run()
    {
        for (int i = 0; i < notes.length; i++) {
            b.write(notes[i]);
        }
  
    }
    
}

class student extends Thread
{
    String name;
    whiteBoard b;
    student(whiteBoard b,String n)
    {
        this.b = b;
        this.name = n;
    }
    
    @Override
    public void run()
    {
        String test;
        b.attendance();
        do{
            test=b.read();
            System.out.println("STUDENT "+this.name+" READING "+test);
            System.out.flush();
        }while(!test.equals("END"));
    }
    
}


public class teacher_student_whiteboard {
    public static void main(String[] args) {
        whiteBoard wb = new whiteBoard();
        teacher t = new teacher(wb);
        student s1 = new student(wb,"SOMU");
        student s2 = new student(wb,"AMUL");
        student s3 = new student(wb,"SHASHANK");
        student s4 = new student(wb,"VIVEK");
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        
    }
}
