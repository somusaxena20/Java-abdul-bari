package javapractice;
//
//class circle {
//
//    public double radius;
//
//    public double area() {
//        return Math.PI * radius * radius;
//    }
//
//    public double perimeter() {
//        return 2 * Math.PI * radius;
//    }
//}
//
//class cylinder2 extends circle {
//
//    public double height;
//
//    public double volume() {
//        return area() * height;
//    }
//}
//
//class account {
//
//    public String accNo;
//    public String name;
//    public String add;
//    public String dob;
//    public String phoneNo;
//    public int balance;
//
//    account(String a, String n, String ad, String d, String p, int b) {
//        this.accNo = a;
//        this.name = n;
//        this.balance = b;
//        this.add = ad;
//        this.dob = d;
//        this.phoneNo = p;
//    }
//
//    public String toString() {
//        return "ACCOUNT NUMBER : " + this.accNo + "\nACCOUNT HOLDER NAME : " + this.name + "\nADDRESS : " + this.add
//                + "\nDATE OF BIRTH : " + this.dob + "\nPHONE NUMBER : " + this.phoneNo + "\nBALANCE : " + this.balance;
//    }
//
//}
//
//class savingAccount extends account {
//
//    private int fixedDeposite;
//
//    public savingAccount(String a, String n, String ad, String d, String p, int b) {
//        super(a, n, ad, d, p, b);
//    }
//
//    public void deposite(int d) {
//        System.out.println("YOU SUCCESSFULLY DEPOSITE " + d);
//        this.balance = this.balance + d;
//    }
//
//    public void withdraw(int w) {
//        System.out.println("YOU SUCCESSFULLY WITHDRAW " + w);
//        this.balance = this.balance - w;
//    }
//
//    public void fixedDeposite(int f) {
//        this.fixedDeposite = f;
//    }
//
//    public String toString() {
//        return super.toString() + "\nFIXED DEPOSITE : " + this.fixedDeposite;
//    }
//}
//
//class loanAccount extends account {
//
//    private int loan;
//    private int loanAmount;
//
//    public loanAccount(String a, String n, String ad, String d, String p, int b) {
//        super(a, n, ad, d, p, b);
//    }
//
//    public void getLoan(int l) {
//        System.out.println("YOUR LOAN REQUEST IS SUCCESFULLY CREDIT IN YOUR ACCOUNT");
//        this.loanAmount = l;
//        this.loan = l;
//    }
//
//    public int checkLoan() {
//        return this.loan;
//    }
//
//    public int checkEMI() {
//        return this.loan * 10 / 100;
//    }
//
//    public void payEMI() {
//        if (this.loanAmount > (this.loan * 10 / 100))
//            this.loanAmount = this.loanAmount - (this.loan * 10 / 100);
//        else {
//            this.loan = 0;
//            this.loanAmount = 0;
//        }
//    }
//
//    public int dueLoan() {
//        return this.loanAmount;
//    }
//
//    public String toString() {
//        return super.toString() + "\nLOAN AMOUNT : " + this.loan;
//    }
//}
//
//public class inheritance {
//
//    public static void main(String[] args) {
//        // circle c = new circle();
//        // cylinder2 c2 = new cylinder2();
//        //
//        // c.radius=10;
//        // c2.height=5;
//        // c2.radius=9;
//        //
//        // System.out.println(c2.perimeter());
//        // System.out.println(c2.volume());
//        // System.out.println(c2.area());
//        // System.out.println(c.area());
//        // System.out.println(c.perimeter());
//
//        // account a = new account("3435662536","SOMU
//        // SAXENA","ADHARTAL","20-07-2000","9340135002",1000);
//        // System.out.println(a);
//        // savingAccount a = new savingAccount("3435662536", "SOMU SAXENA", "ADHARTAL",
//        // "20-07-2000", "9340135002", 1000);
//        // a.fixedDeposite(25000);
//        // System.out.println(a + "\n");
//        // a.deposite(5000);
//        // System.out.println(a);
//
//        loanAccount l = new loanAccount("3435662536", "SOMU SAXENA", "ADHARTAL", "20-07-2000", "9340135002", 1000);
//        l.getLoan(25000);
//        System.out.println(l);
//        l.payEMI();
//        System.out.println();
//        System.out.println(l);
//        l.payEMI();
//        System.out.println();
//        System.out.println(l);
//        System.out.println(l.checkEMI());
//        System.out.println(l.dueLoan());
//    }
//}


//class parent
//{
//    int x=20;
//    public double length;
//    public double breadth;
//    parent()
//    {
//       this.length=1;
//       this.breadth=1;
//    }
//    parent(int l, int b)
//    {
//        this.length=l;
//        this.breadth=b;
//    }
//    
//    public void print()
//    {
//        System.out.println("HELLO FROM SUPER CLASS");
//    }
//    
//}
//
//class child extends parent
//{
//    int x=10;
//    private double height;
//    child()
//    {
//        this.height=1;
//    }
//    child(int x)
//    {
//        this.height=x;
//    }
//    child(int l, int b, int h)
//    {
//        super(l,b);
//        this.height=h;
//    }
//    public double volume()
//    {
//        return this.length * this.breadth * this.height;
//    }
//    
//    void display()
//    {
//        System.out.println(this.x);
//        System.out.println(super.x);
//    }
//
//    @Override
//    public void print() {
//        super.print(); 
//        System.out.println("HELLO FROM SUB CLASS");
//    }
//    
// 
//    
//}
//
//class inheritance
//{
//    public static void main(String[] args) {
//        child c = new child(2,10,15);
//        System.out.println(c.volume());
//        c.display();
//        c.print();
//    }
//}