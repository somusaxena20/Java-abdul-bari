 
package javapractice;
 
public class variable_argument {
    static void show(int ...x)
    {
        for(int y :x)
        {
            System.out.print(y+"\t");
        }
    }
    
    static int max(int ...arr)
    {
        if(arr.length==0)
            return 0;
        int max=arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
            
    static int sum(int ...a)
    {
        if(a.length==0)
            return 0;
        int sum=0;
        for(int i =0; i<a.length;i++)
        {
            sum +=a[i];
        }
        return sum;
    }
    
    static void discount(int ...x)
    {
        for(int i =0;i<x.length;i++)
        {
        if(x[i]>=500 && x[i]<1000)
        {
            System.out.println(x[i]-(x[i]*5)/100);
        }
        else if(x[i]>=1000 && x[i]<3000)
        {
            System.out.println(x[i]-(x[i]*10)/100);
        }
        else if(x[i]>=3000)
        {
            System.out.println(x[i]-(x[i]*15)/100);
        }
        else
        {
            System.out.println("SORRY NO DISCOUNT");
        }
    }
    }
    
    public static void main(String[] args) {
        
        // find max
        
        System.out.println(max(10,20,30,40,50));
        
        // sum of all var args
        
        System.out.println(sum(12,20,30,40,50));
        
        System.out.println("DISCOUNT");
        discount(500,890,900,700);
    }
}
