package MetodosBasicos;

public class Main {
    
    public static void main(String[] args) {
        
        //Calculadora 
        System.out.println("Exercícios de Cauculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
    
    
        //Mensagem
        System.out.println("\nExercício Mensagem: ");
        Mensagens.obterMensagem(9);
        Mensagens.obterMensagem(14);
        Mensagens.obterMensagem(1);

        //Empréstimo
        System.out.println("\nExercício Empréstimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);


    
    }
}
