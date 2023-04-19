package Resolucoes;

import java.util.Scanner;

/*Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo 
o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes 
foi escolhido, através das três palavras fornecidas. */

public class Animal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (AN1.matches("vertebrado")) {
            if (AN2.matches("ave")) {
                if (AN3.matches("carnivoro")) {
                    System.out.println("aguia");

                } else if (AN3.matches("onivoro")) {
                    System.out.println("pomba");

                }
            } else if (AN2.matches("mamifero")) {
                if (AN3.matches("onivoro")) {
                    System.out.println("homem");

                } else if (AN3.matches("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }

        if (AN1.matches("invertebrado")) {
            if (AN2.matches("inseto")) {
                if (AN3.matches("hematofago")) {
                    System.out.println("pulga");

                } else if (AN3.matches("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (AN2.matches("anelideo")) {
                if (AN3.matches("hematofago")) {
                    System.out.println("sanguessuga");

                } else if (AN3.matches("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();

    }

}