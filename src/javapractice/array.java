package javapractice;
 
//import java.util.Scanner;

import java.util.Scanner;

class array{
    public static void insertion(int arr[], int index, int val)
    {
        for(int i = arr.length-1;i>=index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=val;
    }
    public static void deletion(int arr[],int index)
    {
//        arr[index]=arr[index+1];
        for(int i = index;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
    }
    public static void main(String[] args) {
//        int i,j;
        int a[]= new int [5];
//        int b[]={2,4,6,8,10};
//        for(int i =0;i<a.length;i++)
//            System.out.println(a[i]++);
//        for(int i =0;i<a.length;i++)
//            System.out.println(a[i]);
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A NUMBER IN ARRAY");
        int sum=0;
         for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
         
         
         
//         problem 1 finding sum
         
//       for(int x:a)
//       {
//           sum = sum+x;
//       }

    
//    problem 2  search element

//System.out.println("enter the search element");
//        int n = sc.nextInt();
//        int isFound=0;
//        for(int x : a)
//        {
//            if(x==n)
//                isFound =1;
//               System.exit(0);
//        }
//        if(isFound == 1)
//            System.out.println("FOUND "+n);
//        else
//            System.out.println("NOT FOUND "+n);
//        System.out.println("SUM IS "+sum);

//          problem 3 find max

//        int max=a[0];
//        for(int i =0;i<a.length;i++)
//        {
//            if(max<a[i])
//            {
//                max=a[i];
//            }
//        }
//        System.out.println("MAX IS :- "+max);

//        second largest element 

//        int max1 ,max2;
//        max1=max2=a[0];
//        
//        for(int i =0;i<a.length;i++)
//        {
//            if(a[i]>max1)
//            {
//                max2=max1;
//                max1=a[i];
//            }
//            else if(a[i]>max2)
//            {
//                max2=a[i];
//            }
//        }
//        
//        System.out.println("SECOND MAX ELEMENT : "+max2);

//        left rotate

//        int temp =a[0],i;
//        for( i =1;i<a.length;i++)
//        {
//            a[i-1]=a[i];
//        }
//        a[i-1]=temp;
//        for(int x : a)
//        {
//            System.out.print(x+"\t");
//        }

//        right rotate

//        int i,temp =a[a.length-1];
//        for( i = a.length-2;i>=0;i--)
//        {
//            a[i+1]=a[i];
//        }
//        a[i+1]=  temp;
//        for(int x : a)
//        {
//            System.out.print(x+"\t");
//        }


//        insertion using index

//        insertion(a,2,10);
//        for(int x : a)
//            System.out.print(x+"\t");
//        System.out.println();
//        deletion(a,1);
//        for(int x : a)
//            System.out.print(x+"\t");

//        copy the element in another array

//        int b []= new int[5];
//        
//        for(int i=0;i<a.length;i++)
//        {
//            b[i]=a[i];
//        }
//        for(int x: b)
//            System.out.print(x+"\t");

//        reverse copy element in array

//        int b[]=new int [5];
//        for(int i=a.length-1,j=0;i>=0;i--,j++)
//        {
//            b[j]=a[i];
//        }
//        for(int x:b)
//        {
//            System.out.print(x+"\t");
//        }

//        increse the size of array

//        int b[]=new int[2*a.length];
//        
//        for(int i =0;i<a.length;i++)
//        {
//            b[i]=a[i];
//        }
//        a=b;
//        b=null;
//        for(int x:a)
//        {
//            System.out.print(x+"\t");
//        }

        

    }
}
