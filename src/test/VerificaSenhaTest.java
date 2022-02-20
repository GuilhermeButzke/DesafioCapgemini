package test;

import exercicios.VerificaSenha;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class VerificaSenhaTest {
    VerificaSenha verificaSenha = Mockito.spy(VerificaSenha.class);

    @Test
    public void senhaAtendeTamanho() {
        int expected = 0;
        int result = verificaSenha.verificarTamanhoSenha("Ya3&ab");

        Assert.assertEquals(expected, result);
    }

    @Test
    public void senhaAtendeRequisitos() {
        String expected = "A senha atende os requisitos.";
        String result = verificaSenha.verificaRequisitosSenha("Ya3&ab");

        Assert.assertEquals(expected, result);
    }

    @Test
    public void senhaNaoAtendeTamanho() {
        int expected = 3;
        int result = verificaSenha.verificarTamanhoSenha("Ya3");

        Assert.assertEquals(expected, result);
    }

    @Test
    public void senhaNaoAtendeRequisitos() {
        String expected = "A senha não atende todos os requisitos.";
        String result = verificaSenha.verificaRequisitosSenha("Ya3");

        Assert.assertEquals(expected, result);
    }
}
