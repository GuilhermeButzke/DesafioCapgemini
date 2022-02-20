package exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
 * A base e altura da escada devem ser iguais ao valor de n.
 * A última linha não deve conter nenhum espaço.
 */
public class GeraEscada {
    /**
     * Método responsável por gerar a escada.
     *
     * @param tamanho - quantidade de degraus da escada
     * @return string - escada gerada pelo metodo
     */
    public static String gerarEscada(int tamanho) {
        String escada = "";
        int vazio = tamanho - 1;
        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= vazio; j++) {
                escada += " ";
            }

            for (int j = 1; j <= i; j++) {
                escada += "*";
            }
            escada += "\n";
            vazio--;
        }
        return escada;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho;
        System.out.println("Informe o tamanho da escada: ");
        tamanho = sc.nextInt();

        System.out.println(gerarEscada(tamanho));

        sc.close();
    }
}
