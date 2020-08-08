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
public class TypeofFuel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fuel[] = {0, 0, 0, 0};
        System.out.println("MUITO OBRIGADO");
        int command = sc.nextInt();
        while (true) {
            if (command < 4) {
                fuel[command - 1]++;
            }
            command = sc.nextInt();
            if (command == 4) {
                break;
            }

        }

        System.out.println("Alcool: " + fuel[0]);
        System.out.println("Gasolina: " + fuel[1]);
        System.out.println("Diesel: " + fuel[2]);
    }

}
