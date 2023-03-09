/*Faça um programa que peça uma nota, entre zero e dez.
 * Mostra uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe um valor válido.
 */
import java.util.Scanner;

 public class Notas {

    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota Inválida, digite Novamente: ");
            nota = scan.nextInt();
        }
        
        scan.close();
    }
}
