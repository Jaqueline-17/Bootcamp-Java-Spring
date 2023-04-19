package Resolucoes;

import java.util.Scanner;

/*Seu Zé está vendendo frutas com a seguinte tabela de preços: Morango	Até 5K: R$ 2,50 Acima de 5K por Kg	R$ 2,20 por Kg 
 * Maçã	Até R$ 1,80 Acima de 5k por Kg R$ 1,50 por Kg Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
 * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) 
 * de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
*/
public class Quitanda {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
        double totalMorango = 0;
        double totalMaca = 0;
        double desconto = 0;

       if(morangos <= 5) {
            totalMorango = morangos * 2.50;
       } else if (morangos >= 5) {
            totalMorango = morangos * 2.20;
       }
       
       if(macas <= 5) {
            totalMaca = macas * 1.80;
       } else if (morangos >= 5) {
            totalMaca = macas * 1.50;
       }

       int somaKg = morangos + macas;
       double total = totalMorango + totalMaca;

       if(somaKg >= 8 || total > 25) {
         desconto = total * 0.1;
         total = total - desconto;
        }

        System.out.println(total);

        input.close();
    }
}
