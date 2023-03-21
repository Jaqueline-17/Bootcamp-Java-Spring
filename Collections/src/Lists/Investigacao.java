package Lists;

import java.util.Scanner;
import java.util.ArrayList;
/* Utilizando uma Lista, faça um programa que faça cinco perguntas 
 uma pessoa sobre o crime. Se a pessoa responder positivamente a 2 questões 
 ela deve ser classificada como suspeita, entre 3 e 4 como cúmplice
 e 5 como assasina. Caso contrário deve ser classificada como "Inocente."
 */
import java.util.List;

public class Investigacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        String resp = scan.nextLine();
        respostas.add(resp);

        System.out.println("Esteve no local do crime?");
        resp = scan.nextLine();
        respostas.add(resp);

        System.out.println("Mora perto da vítima?");
        resp = scan.nextLine();
        respostas.add(resp);

        System.out.println("Devia para a vítima?");
        resp = scan.nextLine();
        respostas.add(resp);

        System.out.println("Já trabalhou coma vítima?");
        resp = scan.nextLine();
        respostas.add(resp);

        int afirmacoes = 0;

        for (String r : respostas) {
            if (r.equals("s") || r.equals("S")) {
                afirmacoes++;
            }
        }

        System.out.println("===========");
        System.out.println("Veredito: ");

        switch (afirmacoes) {
        
            case (2):
                System.out.println("Suspeito.");
                break;
            case (3):
            case (4):
                System.out.println("Cúmplice.");
                break;
            case (5): 
                System.out.println("Culpado.");
                break;
            default:
                System.out.println("Inocente.");
        }

        scan.close();

    }
}
