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
public class ArrayFillII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t= sc.nextInt();
        int counter=0;
        int n[] = new int[1000];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = counter;
            counter++;
            if (counter>t-1) {
                counter=0;
            }
        }
        
        for (int i = 0; i < n.length; i++) {
            System.out.println("N["+i+"] = "+n[i]);
        }
        
        
    }
    
}
