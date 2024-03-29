package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* Dada a população estimada de alguns estados no Nordeste, faça:
    Estado = PE - População = 9.616.621. 
    Estado = AL - População = 3.351.543. 
    Estado = CE - População = 9.187.103. 
    Estado = RN -  População = 3.534.265. 

    - Crie um dicionário e relacione os estados e suas populações.
    - Substitua a população do estado do RN por 3.534.165.
    - Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277.
    - Exiba a população do PE.
    - Exiba todos os estados e suas populações na ordem que foram informados.
    - Exiba os dados e suas populações em ordem alfabética.
    - Exiba o estado com a menor população e sua quantidade.
    - Exiba o estado com a maior população e sua quantidade.
    - Exiba a soma da população desses estados.
    - Exiba a média da população deste dicionário.
    - Remova os estados com a população menor que 4.000.000.
    - Apague o dicionário.
    - Confira se o dicionário está vazio.
 */

public class Populacao {

    public static void main(String[] args) {

        // Criando Dicionário
        Map<String, Integer> estados = new HashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE ", 9187103);
                put("RN", 3534265);

            }
        };

        System.out.println(estados);
        System.out.println("\n=========");

        // Substituindo população do RN
        estados.put("RN", 3534165);
        System.out.println(estados);
        System.out.println("\n=========");

        // Adicionando o Estado PB
        estados.put("PB", 4039277);
        System.out.println("\n=========");

        // Exibindo População do PE
        System.out.println("População do Estado do PE" + estados.get("PE"));
        System.out.println("\n=========");

        // Exibindo na ordem de inserção
        LinkedHashMap<String, Integer> estados2 = new LinkedHashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE ", 9187103);
                put("RN", 3534265);
                put("PB", 4039277);
            }
        };

        System.out.println(estados2);
        System.out.println("\n=========");

        // Exibindo em ordem alfabética
        TreeMap<String, Integer> estados3 = new TreeMap<>(estados2);
        System.out.println(estados3);
        System.out.println("\n=========");

        // Estado com a menor população

        Collection<Integer> populacao = estados.values();

        String maiorPopulacao = "";
        String menorPopulacao = "";

        for (Map.Entry<String, Integer> entry : estados.entrySet()) {
            if (entry.getValue().equals(Collections.min(populacao)))
                menorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.max(populacao)))
                maiorPopulacao = entry.getKey();
        }

        System.out.println("Maior População: " + maiorPopulacao + Collections.max(populacao));
        System.out.println("Menor População: " + menorPopulacao + Collections.min(populacao));
        System.out.println("\n=========");

        // Soma das Populações

        Iterator<Integer> valorPopulacao = estados.values().iterator();
        int soma = 0;

        while (valorPopulacao.hasNext()) {
            soma += valorPopulacao.next();
        }

        System.out.println("A soma das populações é de: " + soma);
        System.out.println("\n=========");

        // Média das Populações

        int media = (soma / estados.size());
        System.out.println("A média das populações é de: " + media);
        System.out.println("\n=========");

        // Removendo estados com População abaixo de 4,000,000

        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() <= 4000000) {
                iterator.remove();
            }
        }

        System.out.println("Resultado das Remoções: " + estados);
        System.out.println("\n=========");

        // Apagando o Dicionário
        estados.clear();

        // Verificando se está vazio
        System.out.println("A lista está vazia? " + estados.isEmpty());
    }
}
