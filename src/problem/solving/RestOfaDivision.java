/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.solving;

import java.util.Scanner;

/**
 *
 * @author rktirtho
 */
public class RestOfaDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        if (x>y) {
            int temp =x;
            x=y;
            y=temp;
        }
        
        for (int i = x+1; i < y; i++) {
            if (i%5==3 || i%5==2) {
                System.out.println(i);
            }
        }
    }
    
}
