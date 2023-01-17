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
public class quboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b,h,total_area,volume;
        
        System.out.println("ENTER THE VALUE OF LENGTH BREADTH AND HEIGHT");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        
        total_area = 2*(l*b+l*h+b*h);
        volume = l*b*h;
        
        System.out.println("TOTAL AREA : "+total_area);
        System.out.println("VOLUME : "+volume);
        
    }
    
}



