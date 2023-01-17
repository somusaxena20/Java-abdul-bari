/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.*;
/**
 *
 * @author HOME
 */
public class expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float s,area;
        System.out.println("ENTER THE VALUE OF A B AND C");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        s = (a+b+c)/2f;
        
        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("THE AREA OF A TRIANGLE IS : "+area);
        
    }
}
