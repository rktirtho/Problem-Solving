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
public class FixedPassword {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(true){
        int input = sc.nextInt();
        if (input== 2002) {
            System.out.println("Acesso Permitido");
            break;
        } else {
            System.out.println("Senha Invalida");
        }
        }
    }
}
