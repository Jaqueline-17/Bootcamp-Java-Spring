/*Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero = 0;
        int quantPares = 0; 
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
        System.out.println("Número: ");
        numero = scan.nextInt();

        if(numero % 2 == 0){
            quantPares++;
        } else{
            quantImpares++;
        }
         count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
        scan.close();
    }
}
