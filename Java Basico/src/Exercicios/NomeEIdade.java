import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade,
 * (Pare o programa inserindo o valor 0(zero) no campo nome)
 */

public class NomeEIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade = 0;

        while(true){

            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals(0)) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();  
        }

        System.out.println("Nome: " + nome + "Idade: " + idade);
        scan.close();


        
    }
}
