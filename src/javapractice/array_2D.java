 
package javapractice;
 
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        declaring 2d array
        
//        int a[][]=new int[3][4];
//        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//          int a[][];
//          a=new int[3][4];


//        for each loop for 2d array

//        for(int x[]:a)
//        {
//            for(int y:x)
//            {
//                System.out.print(y+"\t");
//            }
//            System.out.println();
//        }

//        jagged array : - diffrent size of array

//        int a[][];
//        a=new int[3][];
//        a[0]=new int[4];
//        a[1]=new int[3];
//        a[2]=new int[2];

 
        int a[][]=new int [3][3];
        int b[][]=new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("ENTER THE VALUE IN MATRIX");
        
        for(int i=0;i<a.length;i++)
        {
            for(int j =0;j<a[i].length;j++)
            {
                 System.out.printf("a[%d][%d] : ",i,j);
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER SECOND MATRICES");
        for(int i=0;i<b.length;i++)
        {
            for(int j =0;j<b[i].length;j++)
            {
                 System.out.printf("b[%d][%d] : ",i,j);
                 b[i][j]=sc.nextInt();
            }
        }
//
//       for(int i =0;i<a.length;i++)
//       {
//           for(int j =0;j<a.length;j++)
//           {
//               c[i][j]=a[i][j]+b[i][j];
//           }
//       }
//       for(int x[]:c)
//       {
//           for(int y : x)
//           {
//               System.out.print(y+"\t");
//           }
//           System.out.println();
//       }


        for(int i =0;i<a.length;i++)
        {
            for(int j =0;j<a.length;j++)
            {
//                c[i][j]=0;
                for(int k =0;k<a.length;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int x[]:c)
        {
            for(int y:x)
            {
                System.out.print(y+"\t");
            }
            System.out.println();
        }
        
        
    }
}
