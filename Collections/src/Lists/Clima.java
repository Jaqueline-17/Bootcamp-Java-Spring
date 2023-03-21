package Lists;

import java.util.ArrayList;
import java.util.Iterator;
/* Exercício Clima: 
   Faça um programa que receba a temperatura média dos 6 primeiros
   meses do ano e armazene-as em uma lista. Após isso, calcule a média semestral das
   temperaturas e mostre todas as temperaturas acima desta média , e em
   que mês elas ocorreram (mostrar o mês por extenso 1 - Janeiro...) 
 */
import java.util.List;
import java.util.Scanner;

public class Clima {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite uma Temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
        }

        double soma = 0;

        for (Double t : temperaturas) {
            soma += t;
        }

        double media = soma / temperaturas.size();

        System.out.println("==========");
        System.out.println(String.format("A média das Temperaturas é de %.1f",  media));

        System.out.println("Meses com temperatura acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        int count = 0;

        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {

                    case (0):
                        System.out.println(String.format("1 - Janeiro %.1f", media));
                        break;
                    case (1):
                        System.out.println(String.format("2 - Fevereiro %.1f", media));
                        break;
                    case (2):
                        System.out.println(String.format("3 - Março %.1f", media));
                        break;
                    case (3):
                        System.out.println(String.format("4 - Abril %.1f", media));
                        break;
                    case (4):
                        System.out.println(String.format("5 - Maio %.1f", media));
                        break;
                    case (5):
                        System.out.println(String.format("6 - Junho %.1f", media));
                        break;
                    default:
                        System.out.println("Não houve mês acima da média.");

                }
            }
            count++;
        }

        scan.close();

    }
}
