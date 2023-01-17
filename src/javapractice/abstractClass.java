package javapractice;

abstract class KFC {
    public int x =10;
    KFC() {
        System.out.println("WELCOME TO KFC");
    }
    
    public void makeItem()
    {
        System.out.println("CHICKEN LOLIPOP");
        System.out.println("CHICKEN BURGER");
        System.out.println("CHICKEN TIKKA");
        System.out.println("CHICKEN BUCKET");
    }
    
    abstract void billing();
    abstract void offer();
    
}

class myKFC extends KFC
{
    private String orderName;
    private float price;
    myKFC(String n, float p)
    {
        this.orderName=n;
        this.price=p;
    }
    
    public void billing()
    {
        System.out.println("ORDER NAME : "+this.orderName);
        System.out.println("PRICE : "+this.price);
    }
    
    public void offer()
    {
        this.price=this.price-(this.price*10)/100;
        billing();
    }
    
}

abstract class shape
{
    abstract double area();
    abstract double perimeter();
}

class circle extends shape
{
    public double radius;
    
    circle(int r)
    {
        this.radius=r;
    }
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

class rectangle1 extends shape
{
    public int length;
    public int breadth;
    
  rectangle1(int x, int y)
  {
      this.length=x;
      this.breadth=y;
  }
  
  public double area()
  {
      return 2*(length*breadth);
  }
  public double perimeter()
  {
      return length*breadth;
  }
    
}

public class abstractClass {

    public static void main(String[] args) {
        myKFC s = new myKFC("CHICKEN LOLIPOP",800.00f);
        s.offer();
        System.out.println(s.x);
//        circle c = new circle(5);
//        System.out.printf("%.2f\n",(float)c.area());
//        System.out.printf("%.2f\n",(float)c.perimeter());
//        
//        shape s =c;
//        System.out.println(s.area());
//        System.out.println();
       
    }
}
