
package javapractice;

interface test
{
    public int x=10;
    void meth1();
    void meth2();
}

class test1 implements test
{
    
    public void meth1()
    {
        System.out.println("TEST 1 METH 1 ");
    }
    public void meth2()
    {
        System.out.println("TEST 1 METH 2");
    }
}

class test2 implements test
{
    public void meth1()
    {
        System.out.println("TEST 2 METH 1");
    }
    public void meth2()
    {
        System.out.println("TEST 2 METH 2");
    }
    
    public void meth3()
    {
        System.out.println("TEST 2 METH 3");
    }
    
}

class phone
{
    public void call()
    {
        System.out.println("CALLING");
    }
    public void sms()
    {
        System.out.println("SENDING SMS");
    }
}

interface camera
{
    public int x=10;
    void click();
    void record();
}

interface gps
{
    void getLocation();
}

interface mediaPlayer
{
    void playMusic();
    void playVideo();
}

class smartPhone extends phone implements gps,camera,mediaPlayer
{
    public void click()
    {
        System.out.println("CLICK SNAP FROM SMARTPHONE");
    }
    public void record()
    {
        System.out.println("RECORD VIDEO FROM SMARTPHONE");
    }
    public void getLocation()
    {
        System.out.println("JABALPUR CURRENT LOCATION");
    }
    public void playMusic()
    {
        System.out.println("PLAYING MUSIC FROM SMARTPHONE");
    }
    public void playVideo()
    {
        System.out.println("PLAYING VIDEO FROM SMARTPHONE");
    }
}

interface member
{
    int X = 10;
    public void callback();
}

class store
{
    coustmer m[]= new coustmer[100];
    int count=0;
    public void register(coustmer m)
    {
        this.m[count++]=m;
    }
    public void inviteSale()
    {
        for(int i =0; i<count;i++)
        {
            m[i].callback();
        }
    }
}


class coustmer  implements member
{
     String n;
    coustmer(String s)
    {
        this.n=s;
    }
    public void callback()
    {
        System.out.println("SIR SPECIAL SALE IN OUR STORE FOR YOUR SIR, "+this.n);
    }
}

interface s
{
    int x=10;
    void sum1();
    void sub();
    default void sum2()
    {
        System.out.println("DEFAULT METHOD");
    }
}

class sum implements s
{
    public void sum1()
    {
        System.out.println("SUM METHOD");
    }
    public void sub()
    {
        System.out.println("SUB METHOD");
    }
}

class phone1
{
   public void call()
   {
       System.out.println("CALLING");
   }
   public void sms()
   {
       System.out.println("SENDING SMS");
   }
}

public class interface_class {
    public static void main(String[] args) {
//        test1 t= new test1();
//        t.meth1();
//        t.meth2();
//        System.out.println(t.x);
       
//           smartPhone s = new smartPhone();
//           s.getLocation();
//           System.out.println(s.x);
           
//            store s = new store();
//            coustmer c = new coustmer("SOMU SAXENA");
//            coustmer c1 = new coustmer("SHASHANK SHARMA");
//            coustmer c2 = new coustmer("AMUL SHARMA");
//            s.register(c);
//            s.register(c1);
//            s.register(c2);
//            s.inviteSale();

//                sum s1 = new sum();
//                s1.sub();
//                s1.sum2();
//                s1.sum1();

        
        System.out.println(s.x);

    }
}
