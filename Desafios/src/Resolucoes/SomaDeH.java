package Resolucoes;

/* Desafio
 * Neste desafio, faça um programa que calcule o valor de H com N termos. 
 * Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
 */

import java.util.Scanner;

public class SomaDeH {
    public static void main(String[] args) {

        double h = 0.0;
        Scanner sc = new Scanner(System.in);
        
       
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            h += 1.0 / i;
 
        }

        System.out.println(String.format("%.2f", h));
        sc.close();
    }   
}
