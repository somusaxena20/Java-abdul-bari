package javapractice.static_final;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class university {

    public static String uName;
}

class student extends university {

    private String rollNo;
    private static int count = 1000;
    private String name;

    Scanner sc = new Scanner(System.in);
    Date d = new Date();

    student() {
        System.out.println("ENTER YOUR NAME : ");
        this.name = sc.nextLine();
        this.name=this.name.toUpperCase();
        System.out.println("ROLL NUMBER GENRATED AUTOMATICALLY BY ACEADMY");
        this.rollNo = (d.getYear() + 1900)+uName +(++count);
        System.out.println("REGISTRATION SUCCESFULLY AT : "+ new Date());
        System.out.println();
    }

    public void getDetails() {
        System.out.print("STUDENT NAME : " + this.name + "\n");
        System.out.print("ROLL NUMBER : " + this.rollNo + "\n");
        System.out.print("UNIVERSITY NAME : " + this.uName + "\n");
        System.out.println();
    }

}

public class student_challenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        university.uName = "RGPV";
        student s[] = new student[10];
        for (int i = 0; i < 5; i++) {

            s[i] = new student();
        }
        for (int i = 0; i < 5; i++) {
            try{
            TimeUnit.SECONDS.sleep(1);
            s[i].getDetails();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
