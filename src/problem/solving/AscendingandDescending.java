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
public class AscendingandDescending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if (x<y) {
                System.out.println("Crescente");
            }else if(x>y){
                System.out.println("Decrescente");
            } else {
                break;
            }
        }

    }
}
