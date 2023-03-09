/*Crie um vetor de 6 números inteiros e mostre-os
 * na ordem inversa
 */

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int count = 0; //Ordem Normal
        System.out.print("Vetor: ");
        while(count < (vetor.length-1)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("Vetor Inverso: ");
        for(int i = (vetor.length -1); i >= 0; i--) { //Ordem Inversa
            System.out.print(vetor[i] + " ");
        }
    }   
}
