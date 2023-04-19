package Resolucoes;

import java.util.Scanner;

public class EspacosEVogais {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        
    
        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
       
       for(int i = 0; i < str.length(); i++){
            char vogal = str.charAt(i);
            if(vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
                quantVogais ++;
            }
       }
       System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
       sc.close();
    }
}
