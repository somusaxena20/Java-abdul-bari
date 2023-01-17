 
package javapractice;
 
import java.util.Scanner;

public class student_challenge_conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // SECOND PROBLEM OF 1ST STUDENT CHALLENGE
        
//        System.out.println("ENTER THE AGE");
//        int age = sc.nextInt();
//        if(age>=14 && age<55)
//            System.out.println("YOU ARE YOUNG");
//        else if(age>55)
//            System.out.println("YOU ARE OLD");
//        else
//            System.out.println("YOU ARE TEEN AGER");

               // THIRD SOLUTION

//            System.out.println("ENTER THE NUMBER OF SUBJECT");
//            int m1 = sc.nextInt();
//            int m2 = sc.nextInt();
//            int m3 = sc.nextInt();
//           float avg = (float)(m1+m2+m3)/3;
//           
//           if(avg>=70)
//               System.out.println("YOUR GRADE IS A");
//           else if(avg>=60 && avg<70)
//               System.out.println("YOUR GRADE IS B");
//           else if(avg>=50 && avg<60)
//               System.out.println("YOUR GRADE IS C");
//           else
//               System.out.println("YOU ARE FAIL");
            
            // STUDENT CHALLENGE IN SECOND VIDEO
            
            // 1ST PROBLEM\
     
//            System.out.println("ENTER A NUMBER");
//            String str = sc.nextLine();
//            
//            if(str.matches("[01]+"))
//                System.out.println("GIVEN NUMBER IS BINARY RADIX = 2");
//            else if(str.matches("[0-7]+"))
//                System.out.println("GIVEN NUMBER IS OCTAL RADIX = 8");
//            else if(str.matches("[0-9A-F]+"))
//                System.out.println("GIVEN NUMBER IS HEXADECIMAL RADIX = 16");
//            else if(str.matches("[0-9]+"))
//                System.out.println("GIVEN NUMBER IS DECIMAL RADIX = 10");
    
            // 2nd problem
            
//            System.out.println("ENTER THE YEAR");
//            int year = sc.nextInt();
//            
//            if(year%4==0)
//            {
//                if(year%400==0 && year%100==0)
//                    {
//                        System.out.println("ITS A LEAP YEAR");
//                    }
//                    else
//                    {
//                        System.out.println("ITS NOT A LEAP YEAR");
//                    }
//                }
//                else
//                {
//                    System.out.println("ITS NOT A LEAP YEAR");
//                }

            // third video
            
            // 1st problem
            
//            System.out.println("ENTER A DAY");
//            int day = sc.nextInt();
//            
//            if(day==1)
//                System.out.println("MONDAY");
//            else if(day==2)
//                System.out.println("TUESDAY");
//            else if(day==3)
//                System.out.println("WEDNESDAY");
//            else if(day==4)
//                System.out.println("THURSDAY");
//            else if(day==5)
//                System.out.println("FRIDAY");
//            else if(day==6)
//                System.out.println("SATURDAY");
//            else if(day==7)
//                System.out.println("SUNDAY");
//            else
//                System.out.println("INVALID DAY");

            // 2nd problem
            
           System.out.println("ENTER URL");
           String url = sc.nextLine();
           
           String protocol = url.substring(0,url.indexOf(":"));
           
           if(protocol.equals("http"))
               System.out.println("HYPER TEXT TRANFER PROTOCOL");
           else if(protocol.equals("ftp"))
               System.out.println("FILE TRANSFER PROTOCOL");
           
           String webType=url.substring(url.lastIndexOf(".")+1, url.length());
           if(webType.equals("com"))
               System.out.println("COMMERCIAL WEBSITE");
           else if(webType.equals("net"))
               System.out.println("NETWORK WEBSITE");
           else if(webType.equals("org"))
               System.out.println("ORGANIGATION WEBSITE");
    }
}
