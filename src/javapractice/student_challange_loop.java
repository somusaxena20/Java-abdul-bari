 
package javapractice;
 
import java.util.Scanner;

public class student_challange_loop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
//       1st video

//         print multiplication table
       
//        System.out.println("ENTER NUMBER OF MULTIPLICATION TABLE");
//        int a = sc.nextInt();
//        for(int i=1;i<=10;i++)
//        {
//            System.out.format("%d X %d = %d\n",a,i,a*i);
//        }

//       sum of n natural number
        
//        System.out.println("ENTER THE N NUMBER SUM");
//        int n = sc.nextInt();
//        int s=0;
//        for(int i =0;i<=n;i++)
//        {
//            s=s+i;
//        }
//        System.out.println("SUM IS = "+s);

//        3rd problem

//        System.out.println("ENTER FACTORIAL NUMBER");
//        int n = sc.nextInt();
//        long f=1;
//        for(int i=n;i>0;i--)
//        {
//            f=f*i;
//        }
//        System.out.println("FACTORIAL NUMBER = "+f);

//        2nd video

//           1st problem

//            System.out.println("ENTER THE VALUE");
//            int n = sc.nextInt();
//            
//            while(n>0)
//            {
//                int r=n%10;
//                System.out.println(r);
//                n = n/10;
//            }
            
//           2nd problem
//
//        System.out.println("ENTER THE VALUE");
//        int n = sc.nextInt();
//        int i=0;
//        
//        while(n>0)
//        {
//            n=n/10;
//            i++;
//        }
//        System.out.println("NUMBER OF DIGIT = "+i);

//        3rd problem

//        System.out.println("ENTER THE VALUE");
//        int n = sc.nextInt();
//        int temp = n;
//        int i=0;
//        while(n>0)
//        {
//            int r=n%10;
//            i=i+(int)Math.pow(r, 3);
//            n = n/10;
//        }
//        if(temp == i)
//        {
//            System.out.println("IT IS A ARMSTRONG NUMBER");
//        }
//        else
//        {
//            System.out.println("NOT A ARM STRONG NUMBER");
//        }
            
            // 4th problem
            
//            reverse the number

//            System.out.println("ENTER THE NUMBER");
//            int n = sc.nextInt();
//            int rev =0,r;
//            
//            while(n>0)
//            {
//                r=n%10;
//                rev = rev*10+r;
//                n = n/10;
//            }
//            System.out.println("REVERSE THE NUMBER = "+rev);            


//            5th problem

//            System.out.println("ENTER THE NUMBER");
//            int n = sc.nextInt();
//            
//            int rev=0,r,num=n;
//            
//            while(n>0)
//            {
//                r = n%10;
//                rev = rev*10+r;
//                n = n/10;
//            }
//
//            if(rev == num)
//            {
//                System.out.println("NUMBER IS PALLINDROM");
//            }
//            else
//            {
//                System.out.println("ITS NOT A PALLINDROM");
//            }

//            3rd video

            


//            System.out.println("ENTER THE NUMBER");
//            int n = sc.nextInt();
////            int r;
//            String str=""+n;
//            char c;
//            
////            without using of it we also done this
//            
////           while(n>0)
////           {
////               r=n%10;
////               n = n/10;
////               str = str +r;
////           }
//           for(int i =0;i<str.length();i++)
//           {
//               c = str.charAt(i);
//               switch(c)
//               {
//                   case '0':
//                       System.out.println("ZERO ");
//                       break;
//                   case '1':
//                       System.out.println("ONE ");
//                       break;
//                   case '2':
//                       System.out.println("TWO ");
//                       break;
//                   case '3':
//                       System.out.println("THREE ");
//                       break;
//                   case '4':
//                       System.out.println("FOUR ");
//                       break;
//                   case '5':
//                       System.out.println("FIVE ");
//                       break;
//                   case '6':
//                       System.out.println("SIX ");
//                       break;
//                   case '7':
//                       System.out.println("SEVEN ");
//                       break;
//                   case '8':
//                       System.out.println("EIGHT ");
//                       break;
//                   case '9':
//                       System.out.println("NINE ");
//                       break;
//                       
//               }
// 
//           }

//        4th video

//        1st proble display A.P. series

//            System.out.print("ENTER THE VALUE OF A : ");
//           int a = sc.nextInt();
//           System.out.print("ENTER THE DIFFRENCE : ");
//           int d = sc.nextInt();
//           System.out.print("ENTER HOW MANY ELEMENT YOU WANT : ");
//           int n = sc.nextInt();
//           
//           for(int i =0;i<n;i++)
//           {
//               System.out.println(a);
//               a=a+d;
//           }
           
//          2nd  display G.P. series

//            System.out.print("ENTER THE VALUE OF A : ");
//           int a = sc.nextInt();
//           System.out.print("ENTER THE DIFFRENCE : ");
//           int d = sc.nextInt();
//           System.out.print("ENTER HOW MANY ELEMENT YOU WANT : ");
//           int n = sc.nextInt();
//
//           d= d/a;
//           for(int i =0;i<n;i++)
//           {
//               System.out.println(a);
//               a= a*d;
//           }

//        3rd problem fibonacci

//        System.out.println("ENTER A VALUE A : ");
//        int a = sc.nextInt();
//        System.out.println("ENTER A VALUE B : ");
//        int  b= sc.nextInt();
//        System.out.println("HOW MANY YOU PRINT");
//        int n = sc.nextInt();
//        
//        int c;
//        System.out.println(a);
//        System.out.println(b);
//        for(int i=0;i<n-2;i++)
//        {
//            c=a+b;
//            System.out.println(c);
//            a=b;
//            b=c;
//        }


//            nested loop

//            1st video 

//              1st problem

//            1 2 3 4  5
//            1 2 3 4  5
//            1 2 3 4  5
//            1 2 3 4  5


//            System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=b;j++)
//                {
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }
            
//            problem 2

//            1 1 1 1 1
//            2 2 2 2 2 
//            3 3 3 3 3
//            4 4 4 4 4 
//            5 5 5 5 5



//            System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=b;j++)
//                {
//                    System.out.print(i+" ");
//                }
//                System.out.println();
//            }


//            problem 3

//            2 3 4 5 6 
//            3 4 5 6 7 
//            4 5 6 7 8
//            5 6 7 8 9
//            6 7 8 9 10
  
//             System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=b;j++)
//                {
//                    System.out.print(j+i+" ");
//                }
//                System.out.println();
//            }

//            4th problem

//                 01 02 03 04 05 
//                 06 07 08 09 10
//                11 12 13 14 15
//                16 17 18 19 20
//                21 22 23 24 25



//            System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            int count=0;
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=b;j++)
//                {
//                    System.out.format("%02d\t",++count);
//                }
//                System.out.println();
//            }

//            2nd video

//                1st problem

//            1
//            1 2
//            1 2 3
//            1 2 3 4 
//            1 2 3 4 5

//             System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=i;j++)
//                {
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }

//            2nd problem

//                1
//                1 2
//                1 2 3
//                1 2 3 4 
//                1 2 3 4 5

//             System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            int count=0;
//            
//            
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=i;j++)
//                {
//                    System.out.printf("%02d ",++count);
//                }
//                System.out.println();
//            }

//            3rd problem

//                1 2 3 4 5 
//                1 2 3 4
//                1 2 3 
//                1 2 
//                1
                
//             System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            
//            for(int i=0;i<a;i++)
//            {
//                for(int j= 1;j<=b-i;j++)
//                {
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }

//            video 3

//            1 st problem 

//            * * * * *
//              * * * * 
//                 * * *
//                    * *
//                       *
//             System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=b;j++)
//                {
//                    if(j>=i)
//                    {
//                        System.out.print("*");
//                    }
//                    else
//                    {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }

//            problem 2nd

//                       *
//                     * *
//                   * * *
//                 * * * *
//              * * * * *



//            System.out.println("ENTER THE ROW");
//            int a = sc.nextInt();
//            System.out.println("ENTER THE COLUMN");
//            int b = sc.nextInt();
//            
//            for(int i=1;i<=a;i++)
//            {
//                for(int j= 1;j<=b;j++)
//                {
//                    if(i+j>a)
//                    {
//                        System.out.print("*");
//                    }
//                    else
//                    {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
            
            for(int i=1; i<=5;i++)
            {
                for(int j=1;j<=5;j++)
                {
                    if(i+j>5)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                for(int k =0;k<=i-2;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i =1;i<=5-1;i++)
            {
                for(int j =0;j<=5-1;j++)
                {
                    if(j>=i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
               for(int k =0;k<5-2-i+1;k++)
               {
                   System.out.print("*");
               }
                System.out.println();
            }
    }
}
