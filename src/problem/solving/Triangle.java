/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.solving;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, area;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        if ((a+b)<=c || (a+c)<=b || (b+c)<=a) {
            area =  ((a+b)/2)*c;
            System.out.printf("Area = %.1f\n", area);
            
        } else {
            
            area =a+b+c;
            System.out.printf("Perimetro = %.1f\n", area);
        }
        
    }

}
