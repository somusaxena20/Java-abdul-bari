/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class quadtratic_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        
        System.out.println("ENTER THE VALUE OF A B AND C : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        r1 = (-b + Math.sqrt((b*b -2*a*c))/(2*a));
        r2 = (-b - Math.sqrt((b*b -2*a*c))/(2*a));
        
        System.out.println("ROOT FOR R1 " +r1 +"  AND R2  ARE : "+r2);
    }
}
