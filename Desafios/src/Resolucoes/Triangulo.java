package Resolucoes;

import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;

        

        if((A<B+C) && (B<A+C) && (C<A+B)) {
            soma = A + B + C;
            System.out.println("Perimetro = " + soma);
        } else {
            maior = ((A + B) * C) / 2;
            System.out.println("Area = " + maior);
        }

        leitor.close();
    }
}
