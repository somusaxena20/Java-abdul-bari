package javapractice.collection_framework;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

class account implements Serializable {

    public String name;
    public String accNo;
    public double balance;

    Scanner sc = new Scanner(System.in);

    account() {
    }

    account(String n, String a, double b) {

        this.name = n;

        this.accNo = a;

        this.balance = b;
    }

    @Override
    public String toString() {
        return "****ACCOUNT DETAILS****\nACCOUNT NUMBER : " + this.accNo + "\nNAME : " + this.name + "\nBALANCE : " + this.balance;
    }

}

public class student_challange_account {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        HashMap<String, account> hm = new HashMap<>();

        account ac=null;

//        RETRIVING OLD DATA FROM FILES
        try {
            FileInputStream fis = new FileInputStream("C:/New folder/pp/account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                ac = (account) ois.readObject();
                hm.put(ac.accNo, ac);
            }

            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
        }

//        PUTTING THE DATA INTO FILE 
        FileOutputStream fos = new FileOutputStream("C:/New folder/pp/account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("MENU");
        int choice;
        String accno, name;
        double Balance;

        do {

            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. DELETE ACCOUNT");
            System.out.println("3. VIEW ACCOUNT DETAILS");
            System.out.println("4. VIEW ALL ACCOUNT");
            System.out.println("5. STORE IN A FILE");
            System.out.println("6. EXIT");
            System.out.println("ENTER YOUR CHOICE : ");
            choice = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switch (choice) {
                case 1:
                    System.out.println("ENTER NAME ,ACCOUNT NUMBER AND BALANCE : ");
                    ac = new account(sc.nextLine(),sc.nextLine(),sc.nextDouble());
                    hm.put(ac.accNo, ac);
                    System.out.println(ac.name + " YOUR ACCOUNT IS CREATED!");
                    break;
                case 2:
                    System.out.println("ENTER ACCOUNT NUMBER TO BE DELETE : ");
                    accno = sc.nextLine();
                    hm.remove(accno);
                    break;
                case 3:
                    System.out.println("ENTER ACCOUNT NUMBER TO BE SEARCHED : ");
                    String search = sc.nextLine();
                    ac = hm.get(search);
                    System.out.println(ac);
                    break;
                case 4:
                    System.out.println("VIEW ALL DATA");
                    for (account x : hm.values()) {
                        System.out.println(x);
                    }
                    break;
                case 5:
                    break;
                case 6:
                    oos.writeInt(hm.size());
                    for (account x : hm.values()) {
                        oos.writeObject(x);
                    }

            }
        } while (choice != 6);
        oos.flush();
        oos.close();
        fos.close();

    }
}
