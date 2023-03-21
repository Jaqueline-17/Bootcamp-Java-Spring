package Resolucoes;

/* Desafio
 * Neste desafio, faça um programa que calcule o valor de H com N termos. 
 * Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
 */

import java.util.Scanner;

public class SomaDeH {
    public static void main(String[] args) {

        double h = 0, n = new java.util.Scanner(System.in).nextDouble();
       for (int i = 1; i <= n; h += (1.0 / i), i++);
       System.out.println(Math.round(h));
        
    }   
}
