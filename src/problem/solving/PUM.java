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
public class PUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int des = 4;
        for (int i = 0; i < 7; i++) {
            for (int j = count; j <= des; j++) {
                if (j % 4 == 0) {
                    System.out.print("PUM\n");
                } else {
                    System.out.print(j + " ");
                }
            }
            count += 4;
            des += 4;
        }
    }

}
