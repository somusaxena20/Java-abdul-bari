package javapractice.exceptionhandling;

import java.util.Scanner;
//import javapractice.exceptionhandling.FileNotPresent;

class media {

    public void video(int v)throws NegativeDimensionException {
        if (v < 0) {
            throw new NegativeDimensionException();
        }

    }

    public void image(int i) {
        if (i < 0) {
            throw new FileNotPresent();
        }
    }

    public void audio(int a) {
        if (a < 0) {
            throw new FileNotPresent();
        }
    }
}

public class finally_block {

    public static void main(String[] args)throws NegativeDimensionException {
        media m = new media();
        try {
            m.audio(new Scanner(System.in).nextInt());
            m.image(new Scanner(System.in).nextInt());
            m.video(new Scanner(System.in).nextInt());
        } 
        finally
        {
            System.out.println("THANKS FOR USING !");
        }
    }

}
