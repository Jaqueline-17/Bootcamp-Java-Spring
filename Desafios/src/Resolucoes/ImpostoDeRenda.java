package Resolucoes;

import java.util.Scanner;

public class ImpostoDeRenda {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
      

        if (renda >= 0 && renda <= 2000) {
        	System.out.println("Isento");
        } else if (renda > 2000 && renda <= 3000) {
        	System.out.println(String.format("R$ %.2f", (renda - 2000) * 0.08));
        } else if (renda > 3000 && renda <= 4500) {
        	System.out.println(String.format("R$ %.2f", ((renda - 3000)  * 0.18) + 80));
        } else {
        	System.out.println(String.format("R$ %.2f", ((renda - 4500) * 0.28) + 350));
        }

        leitor.close();
    }
}
