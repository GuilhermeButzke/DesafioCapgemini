package test;

import exercicios.AnaliseCombinatoria;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AnaliseCombinatoriaTest {
    AnaliseCombinatoria analiseCombinatoria = Mockito.spy(AnaliseCombinatoria.class);

    @Test
    public void quantidadeAnagramaValido(){
        int expected = 2;
        int result = analiseCombinatoria.verificaAnagrama("ovo");

        Assert.assertEquals(expected, result);
    }

    @Test
    public void quantidadeAnagramaValido2(){
        int expected = 3;
        int result = analiseCombinatoria.verificaAnagrama("ifailuhkqq");

        Assert.assertEquals(expected, result);
    }
}
