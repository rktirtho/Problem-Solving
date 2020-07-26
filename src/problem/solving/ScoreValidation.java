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
public class ScoreValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total =0;
        double avg =0;
        double number =0;
        
        int i =0;
        int j =0;
        while(i <2){
            number = sc.nextDouble();
            if(number >=0 && number <=10){
                i++;
                total+=number;
            }else{
                System.out.println("nota invalida");
            }
        }
        System.out.println("media = "+total/2);
    }
    
}
