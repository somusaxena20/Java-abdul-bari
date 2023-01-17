package javapractice.exceptionhandling;

import java.util.*;

class StackOverFlowException extends Exception {

    public String toString() {
        return "STACK IS OVER FLOW";
    }

    public String getMessage() {
        return "FULL STACK";
    }
}

class StackUnderFlowException extends Exception {

    public String toString() {
        return "STACK IS UNDER FLOW";
    }

    public String getMessage() {
        return "EMPTY STACK";
    }
}

class stack {

    public int a[] = new int[5];
    int top = -1;

    public void insert(int x) throws StackOverFlowException {
        if (top == a.length - 1) {
            throw new StackOverFlowException();
        } else {
            a[++top] = x;
            System.out.println("INSERTED SUCESSFULLY");
        }
    }

    public void delete() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        } else {
            a[top--] = 0;
            System.out.println("DELETED SUCESSFULLY");
        }
    }

    void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

}

public class student_challange_stack {

    public static void main(String[] args) {
       boolean b = true;
        stack s = new stack();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("\t WELCOME TO STACK\n1 . INSERT : \n2 . DELETE : \n3 . DISPLAY : \n4 . EXIT : \n");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("ENTER NUMBER TO BE INSERTED : ");
                    try
                    {
                    s.insert(sc.nextInt());
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try
                    {
                    s.delete();
                    }
                    catch(Exception e)
                    {
                     e.printStackTrace();
                    }
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    b = false;
                    break;
            }
        } while (b);

    }

}
