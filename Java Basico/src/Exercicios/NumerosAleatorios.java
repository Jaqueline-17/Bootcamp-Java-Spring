import java.util.Random;

/* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 *  e armazene-os num vetor. Ao final mostre os números e seu sucessores.
 */

public class NumerosAleatorios {
    public static void main(String[] args) {
         
        Random random =  new Random(); // Geração de Números aleatórios

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); //Indica o número limite que pode ser gerado
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("Sucessores Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
