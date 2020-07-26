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
public class DividingXbyY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = 0;
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                z = x / y;
                System.out.println(z);
            }
            i++;
        }

    }
}
