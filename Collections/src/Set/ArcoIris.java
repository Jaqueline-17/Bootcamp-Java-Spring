package Set;
/*Crie um conjunto contendo as cores do arco-íris e:
 * - Exiba as cores uma abaixo da outra.
 * - A quantidade de cores que o arco-íris tem.
 * - Exiba as cores em ordem alfabética
 * - Exiba as cores na ordem inversa que foi iformada.
 * - Exiba todas as cores que começam com a letra "v".
 * - Remova todas as cores que não começam coma letra "v".
 * - Limpe o conjunto.
 * - Confira se o Conjunto está vazio.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArcoIris {

    public static void main(String[] args) {

        HashSet<String> cores = new HashSet<>() {
            {
                add("vermelho");
                add("verde");
                add("azul");
                add("preto");
                add("amarelo");
            }
        };

        // Exibição uma abaixo da outra
        for (String cor : cores) {
            System.out.println(cor);
        }
        System.out.println("=======");

        // Quantidade
        System.out.println("A quantidade de cores é de: " + cores.size());
        System.out.println("=======");

        // Ordem Inversa
        System.out.println("Exibição em Ordem Inversa: ");
        LinkedHashSet<String> coresOrdemInversa = new LinkedHashSet<>(
                Arrays.asList("vermelho", "azul", "preto", "verde", "amarelo"));
        System.out.println(coresOrdemInversa);
        ArrayList<String> coresList = new ArrayList<>(coresOrdemInversa);
        Collections.reverse(coresList);
        System.out.println(coresList);
        System.out.println("=======");

        // Ordem Alfabética

        TreeSet<String> cores2 = new TreeSet<>() {
            {
                add("vermelho");
                add("verde");
                add("azul");
                add("preto");
                add("amarelo");
            }
        };

        System.out.println(cores2);
        System.out.println("=======");

        // Cores com a letra "v"
        for (String cor : cores2) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }
        System.out.println("=======");

        // Removendo cores sem a letra "v"
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) {
                iterator.remove();
            }
            System.out.println(cores);
        }
        System.out.println("=======");
        // Limpando o conjunto
        cores.clear();
        System.out.println("=======");
        
        // Conferindo se está vazio
        System.out.println("O conjunto está vazio?: " + cores.isEmpty());

    }

}
