import java.util.Scanner;

/*Desenvolva um operador de Tabuada, capaz de gerar
 * a tabuada de qualquer número inteiro.
 * O usuário deve informar de qual numero ele deseja 
 * ver a tabuada.
 */

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

        scan.close();
    }
}
