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
public class Multiplesof13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = x; i <= y; i++) {
            if (i % 13 == 0)continue;
            sum += i;
        }
        System.out.println(sum);
    }

}
