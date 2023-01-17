 
package javapractice;
 
import java.util.Scanner;

public class switch_conditional_statement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // 1st video
        
        // 1st problem 
        
//        System.out.println("ENTER A DAY NUMBER");
//        int day =sc.nextInt();
//        
//        switch(day)
//        {
//            case 1:
//                System.out.println("MONDAY");
//                break;
//            case 2:
//                System.out.println("TUESDAY");
//                break;
//            case 3:
//                System.out.println("WEDNESDAY");
//                break;
//            case 4:
//                System.out.println("THURSDAY");
//                break;
//            case 5:
//                System.out.println("FRIDAY");
//                break;
//            case 6:
//                System.out.println("SATURDAY");
//                break;
//             case 7:
//                System.out.println("SUNDAY");
//                break;
//             default:
//                 System.out.println("INVALID DAY NUMBER");
//                 break;
//        }
        
//           2nd problem

//               System.out.println("ENTER MONTH NUMBER");
//              int month=sc.nextInt();
//              
//              switch(month)
//              {
//                  case 1:
//                      System.out.println("JANUARY");
//                      break;
//                  case 2:
//                      System.out.println("FEBUARY");
//                      break;
//                 case 3:
//                      System.out.println("MARCH");
//                      break;
//                  case 4:
//                      System.out.println("APRIL");
//                      break;
//                  case 5:
//                      System.out.println("MAY");
//                      break;
//                 case 6:
//                      System.out.println("JUNE");
//                      break;
//                 case 7:
//                      System.out.println("JULY");
//                      break;
//                 case 8:
//                      System.out.println("AUGUEST");
//                      break;
//                 case 9:
//                      System.out.println("SEPTEMBER");
//                      break;
//                 case 10:
//                      System.out.println("OCTOUBER");
//                      break;
//                 case 11:
//                      System.out.println("NOVEMBER");
//                      break;
//                 case 12:
//                      System.out.println("DECEMBER");
//                      break;
//                 default:
//                     System.out.println("INVALID NUMBER");
//                     break;
//              }

            // 3rd problem
            
            
//            System.out.println("ENTER URL");
//            String str = sc.nextLine();
//            
//            String webType=str.substring(str.lastIndexOf("."));
//            
//            switch(webType)
//            {
//                case ".com":
//                    System.out.println("COMMERCIAL WEBSITE");
//                    break;
//                case ".net":
//                    System.out.println("NETWORK WEBSITE");
//                    break;
//                case ".org":
//                    System.out.println("ORGANIGATION WEBSITE");
//                    break;
//                default:
//                    System.out.println("SOME PRIVATE WEBSITE");
//                    break;
//            }


//              2nd video

            System.out.println("ENTER FIRST NUMBER");
            int a =sc.nextInt();
            
            System.out.println("ENTER SECOND NUMBER");
            int b =sc.nextInt();
            
            System.out.println("ENTER THE OPTION");
            sc.nextLine();
            String opt = sc.nextLine();
            
            
            opt = opt.toUpperCase();
            
            switch(opt)
            {
                case "ADD":
                    System.out.println("ADDITION = "+ (a+b));
                    break;
               case "SUB":
                    System.out.println("ADDITION = "+ (a-b));
                    break;
               case "MULTI":
                    System.out.println("ADDITION = "+ (a*b));
                    break;
               case "DIV":
                    System.out.println("ADDITION = "+ (a/b));
                    break;
               default:
                   System.out.println("INVALID OPTION");
                   break;
            }
    }
}
