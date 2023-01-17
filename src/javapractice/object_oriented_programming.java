 
package javapractice;

class cylinder1
{
    private double radius;
    private int height;
    
    private void setRadius(int r)
    {
        this.radius=r;
    }
    private void setHeight(int h)
    {
        this.height=h;
    }
    cylinder1(int r, int h)
    {
        setRadius(r);
        setHeight(h);
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class product
{
    private String itemNo;
    private String name;
    private double price;
    private int qty;
    
//    public void setItemNo(String i)
//    {
//        itemNo=i;
//    }
//    public void setName(String s)
//    {
//        name=s;
//    }
    public void setPrice(double p)
    {
        price=p;
    }
    public void setQuantity(int i)
    {
        qty=i;
    }
    
    product(String i)
    {
        this.itemNo=i;
    }
    product(String i, String n)
    {
        this.itemNo=i;
        this.name=n;
    }
    product(String i, String n, double p, int q)
    {
        this.itemNo=i;
        this.name=n;
        this.price=p;
        this.qty=q;
    }
    
   public void showDetails()
   {
       System.out.println("                     SHIVA MOBILES                ");
       System.out.println("PRODUCT ITEM NUMBER : "+itemNo);
       System.out.println("PRODUCT NAME : "+name);
       System.out.println("PRICE : "+price);
       System.out.println("QUANTITY : "+qty);
   }
    
}

class customer
{
    private String cusID;
    private String name;
    private String add;
    private int number;
    
    customer(String i, String  n)
    {
        this.cusID=i;
        this.add=n;
    }
    customer(String i, String  n, String a, int num)
    {
        this.cusID=i;
        this.name=n;
        this.add=a;
        this.number=num;
    }
    
    public void setAdd(String s)
    {
        this.add=s;
    }
    public void setNumber(int n)
    {
        this.number=n;
    }
    
    public void showDetails()
    {
        System.out.println("CUSTOMER ID : "+this.cusID);
        System.out.println("CUSTOMER NAME : "+this.name);
        System.out.println("ADDRESS : "+this.add);
        System.out.println("NUMBER : "+this.number);
    }
    
}

class subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int obtainedMarks;
    
    subject(String s, String n, int m, int o)
    {
        this.subID=s;
        this.name=n;
        this.maxMarks=m;
        this.obtainedMarks=o;
    }
    public String toString()
    {
        return "SUB ID : "+subID+"\nNAME : "+name+"\nMAX MARKS : "+maxMarks+"\nOBTAINED MARKS : "+this.obtainedMarks;
    }
    
     
}

public class object_oriented_programming {
    public static void main(String[] args) {
        cylinder1 c = new cylinder1(12,10);
        System.out.println(c.area());
        product p = new product("121212","REDMI NOTE 9",13000.00,1);
        p.showDetails();
        customer c2;
        c2 = new customer("11101","SOMU SAXENA","NEW KANCHANPUR ADHARTAL",932);
        c2.showDetails();
        subject s[]=new subject[3];
        s[0]=new subject("s101","toc",100,70);
        s[1]=new subject("s102","toc",100,60);
        s[2]=new subject("s103","toc",100,60);

        for(subject t : s)
            System.out.println(t);
    }
}
