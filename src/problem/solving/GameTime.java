
package problem.solving;

import java.util.Scanner;


public class GameTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startTime, endTime;
        startTime = sc.nextInt();
        endTime = sc.nextInt();
        if (startTime==endTime) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(startTime>endTime){
            System.out.println("O JOGO DUROU "+((24+endTime)-startTime) +" HORA(S)");
        } else {
            System.out.println("O JOGO DUROU "+(endTime-startTime) +" HORA(S)");
        }
    }
}
