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
public class SumofConsecutiveOddNumbersII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            int t =0;
            if (y<x){
                t = y;
                y=x;
                x = t;
            }
            int res=0;
            for (int j = x+1; j < y; j++) {
                if (j % 2 == 1) {
                    res+=j;
                }
                
            }
            System.out.println(res);
        }
    }
}
