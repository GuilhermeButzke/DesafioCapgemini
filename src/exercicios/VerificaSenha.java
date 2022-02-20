package exercicios;

import java.util.Scanner;

/**
 * Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia
 * o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte
 * quando ela satisfaz os seguintes critérios:
 * <p>
 * Possui no mínimo 6 caracteres.
 * Contém no mínimo 1 digito.
 * Contém no mínimo 1 letra em minúsculo.
 * Contém no mínimo 1 letra em maiúsculo.
 * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 * <p>
 * Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
 * Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
 * para uma string qualquer ser considerada segura.
 **/
public class VerificaSenha {

    /**
     * Método responsável por verificar a quantidade mínima de caracteres para uma senha segura.
     * <p>
     * Neste método é realizada a conversão da String senha para um Array utilizando expressões regulares.
     *
     * @param senha - string recebida pelo usuário
     * @return int - quantidade de caracteres faltantes para uma senha segura
     */
    public static int verificarTamanhoSenha(String senha) {
        String[] senhaArray = senha.split("(?!^)");
        final int TAM = 6;

        if (senhaArray.length < TAM) {
            return TAM - senhaArray.length;
        } else
            return 0;
    }

    /**
     * Método responsável por verificar se a senha satifaz os critérios.
     * <p>
     * Para realizar a verificação é utilizado regex, onde:
     * ^ representa o início da string.
     * (?=.*[0-9]) verifica se há a ocorrência de um dígito
     * (?=.*[a-z]) verifica se há uma letra em minúsculo
     * (?=.*[A-Z]) verifica se há uma letra em maiúsculo
     * (?=.*[!@#$%^&*()-+]) verifica se há um caractere especial do conjunto contido nas chaves
     * (? = \\ S + $) inibe a alocação de espacos em branco na senha
     * . {6,} representa pelo menos 6 caracteres sem limite máximo
     * $ representa o final da string.
     *
     * @param senha - string recebida pelo usuário
     * @return String - mensagem informando caso a senha atenda os requisitos ou não
     */
    public static String verificaRequisitosSenha(String senha) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])"
                + "(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6,}$";

        if (!senha.matches(regex))
            return "A senha não atende todos os requisitos.";
        else
            return "A senha atende os requisitos.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        String senha = sc.nextLine();

        System.out.println(verificarTamanhoSenha(senha));
        System.out.println(verificaRequisitosSenha(senha));

        sc.close();
    }
}
