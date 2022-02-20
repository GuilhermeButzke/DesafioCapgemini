package exercicios;

import java.util.*;

/**
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para
 * formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de
 * substrings que são anagramas.
 */
public class AnaliseCombinatoria {

    /**
     * Método que verifica a quantidade de anagramas em uma String qualquer.
     * <p>
     * Neste método utilizamos um HashMap para armazenar os pares de anagramas e realizar a comparação posteriormente.
     * <p>
     * Percorremos a largura da palavra informada pelo usuário e armazenamos na variável aux um conjunto de caracteres
     * para realizar a comparação;
     *
     * @param palavra - palavra ou parte da palavra ser ordenada
     * @return int - quantidade de pares de anagramas da palavra
     */
    public static int verificaAnagrama(String palavra) {
        int qtd = 0;
        Set<String> paresAnagrama = new HashSet<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                String aux = palavra.substring(i, j + 1);
                aux = ordenaString(aux);
                boolean resposta = paresAnagrama.add(aux);
                if (!resposta) {
                    qtd++;
                }
            }
        }
        return qtd;
    }

    /**
     * Método responsável por ordenar a string para verificação dos anagramas pares.
     * <p>
     * Nela, a String é convertida para array para ser organizada em ordem alfabética.
     * <p>
     * Logo após é necessário converter o array para string novamente.
     *
     * @param string - palavra ou parte da palavra ser ordenada
     * @return string - escada gerada pelo metodo
     */

    private static String ordenaString(String string) {
        char[] sArray = string.toCharArray();
        Arrays.sort(sArray);
        return String.valueOf(sArray);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a palavra: ");
        String palavra = sc.nextLine();

        System.out.println(verificaAnagrama(palavra));

        sc.close();
    }
}
