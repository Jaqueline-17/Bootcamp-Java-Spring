package Resolucoes;

/*Desafio
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
 com um dígito após o ponto decimal.
 */

import java.util.Scanner;

public class PositivosEMedia {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;
     double numerosPositivos = 0;

     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();

            if(x > 0){
                cont++;
                numerosPositivos = numerosPositivos + x;
            }

        }
        
        media = numerosPositivos / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
        leitor.close();
    }}
