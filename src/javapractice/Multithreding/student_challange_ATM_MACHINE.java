package javapractice.Multithreding;

class ATM {

    private int x;
    private boolean x1=true;

    public void checkBalance(String n, int i) {
        System.out.print("NAME : " + n + "\nPROCESSING");
        for (int j = 0; j < 10; j++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.print("\nBALANCE : " + i + "\n");
    }

    public void withdraw(int i) {
        System.out.println("WITHDRAW AMOUNT : "+i);
    }
    synchronized public void useATM(String name,int Amount) {

//        while (x1 == true) {
//            System.out.println("1 : CHECK BALANCE\n2 : WITHDRAW");
//            switch (new Scanner(System.in).nextInt()) {
//                case 1:
//                    checkBalance(name, Amount);
//                    break;
//                case 2:
//                    withdraw(Amount);
//                    break;
//                case 3:
//                    x1 = false;
//                    break;
//            }
//        }
        checkBalance(name, Amount);
        withdraw(2000);

    }
}

class coustmer extends Thread {

    ATM atm;
    public String name;
    public int Amount;
    boolean x = true;

    coustmer(ATM A, String n, int a) {
        this.Amount = a;
        this.name = n;
        this.atm = A;
    }

    @Override
    public void run() {
        atm.useATM(name,Amount);
    }
}

public class student_challange_ATM_MACHINE {

    public static void main(String[] args) {
        ATM a = new ATM();
        coustmer c1 = new coustmer(a, "SOMU SAXENA", 5000);
        coustmer c2 = new coustmer(a, "AMUL SHARMA", 10000);
        c1.start();
        c2.start();
//        System.out.println(c1.getState());
//        System.out.println(c2.getState());

    }
}
