package javapractice;

public class methods {

//    int a = 10;
////
////    static void max(methods m) {
////        m.a++;
////
////    }
//
//    static String match(String s) {
//        return s.replace(s, "AMAN");
//    }
//    static void isPrime(int n)
//    {
//        boolean b = true;
//        for(int i = 2;i<(n/2);i++)
//        {
//            if(n%i==0)
//            {
//                b = false;
//            }
//        }
//       if(b == true)
//       {
//           System.out.println("IT IS PRIME NUMBER");
//       }
//       else
//       {
//           System.out.println("NOT A PRIME NUMBER");
//       }
//    }
//    
//    static void gcd_number(int m, int n)
//    {
//        while(m!=n)
//        {
//            if(m>n)
//                m=m-n;
//            else
//                n=n-m;
//        }
//        System.out.println(m+ "\t"+n);
//    }
//    
//    static void lcm(int n)
//    {
//        for(int i =2;i<n;i++)
//        {
//            if(n%i==0)
//            {
//                System.out.println("NUMBER "+(n/i));
//            }
//        }
//    }
//    
////    static void max( int arr[])
////    {
////        int max = arr[0];
////        for( int i =1; i<arr.length;i++)
////        {
////            if(arr[i]>max)
////                max = arr[i];
////        }
////        System.out.println("MAX ELEMENT IS "+max);
////    }
////    static int max(int x, int y)
////    {
////        return x>y?x:y;
////    }
//
//    
//    static float max(float x, float y)
//    {
//        return x>y?x:y;
//    }
////    
//    public static void main(String[] args) {
//        int a = 10, b = 10;
//        String str = new String("SOMU");
//        methods m = new methods();
////        max(m);
//        System.out.println(a + "\t" + b);
//        str = match(str);
//        System.out.println(str);
//        
//        // checking the number is prime 
//        
//        int n = 16;
//       
//        isPrime(n);
//        
//        // finding GCD of a two number
//        
//        gcd_number(6,12);
//        
//        // find max of array
//         int arr[] = {5,13,41,25,84};
////        max(arr);
//        
//        System.out.println("MAX IS : "+max(10,20));
//        System.out.println("MAX IS : "+max(30.2f,20.2f));
    static int area(int l, int b) {
        return l * b;
    }

    static double area(double r) {
        return Math.PI * r * r;
    }

    // reverse array
    static void reverse(int arr[]) {
        int temp;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // reverse number
    static int reverse(int n) {
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }
    
    // validate name
    
    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z]+");
    }
    
//    validate age
    
    static boolean validate(int age)
    {
        if(age>3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

//        area of rectangle and circle
        System.out.println("AREA OF RECTANGLE : " + area(10, 4));
        System.out.println("AREA OF circle : " + (float) area(4));

//        overloaded method to reverse int or array
        int a[] = {1, 2, 3, 4, 5};

        reverse(a);
        for (int x : a) {
            System.out.print(x + "\t");
        }
        
        // int reverse
        
        System.out.println("\nreverse number : "+reverse(123));

        // validate name
        
        System.out.println("NAME IS VALIDATE : "+validate("SOMU"));
        
        // validate your are a student
        
        System.out.println("YOU ARE STUDENT : "+validate(18));
    }

}
