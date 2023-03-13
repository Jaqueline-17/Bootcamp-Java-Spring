package Resolucoes;

/* Desafio
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de fábrica). O gerente de uma loja de carros 
gostaria de um programa para calcular o preço de um carro novo para os clientes. Você receberá 
o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e deverá escrever 
programa para ler esses valores e imprimir o valor final do carro. */

import java.util.Scanner;

public class Porcentagem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica;
        int porcentagemDistribuidor;
        int percentualImpostos;

        int custoConsumidor;

        int distribuidor;
        int valorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos
        // impostos:

        custoFabrica = scan.nextInt();
        distribuidor = scan.nextInt();
        valorImpostos = scan.nextInt();

        porcentagemDistribuidor = ((custoFabrica * distribuidor) / 100);
        
        percentualImpostos = ((custoFabrica * valorImpostos) / 100);

        custoConsumidor = custoFabrica + porcentagemDistribuidor + percentualImpostos;

        System.out.println("O valor final para o consumidor é de: R$" + custoConsumidor);

        scan.close();
    }
}
