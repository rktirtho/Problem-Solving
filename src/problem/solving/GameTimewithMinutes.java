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
public class GameTimewithMinutes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sh = sc.nextInt();
        int sm = sc.nextInt();
        int eh = sc.nextInt();
        int em = sc.nextInt();
        int hour = eh - sh;
        int min = em - sm;

        
        if (hour < 0) {
            hour = 24 + (eh - sh);
        }
        
        if (min < 0) {
            min = 60 + (em - sm);
            hour -= 1;
        } 
        
        if (sh == eh && sm == em) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + hour + " HORA(S) E " + min + " MINUTO(S)");
        }

    }
}
