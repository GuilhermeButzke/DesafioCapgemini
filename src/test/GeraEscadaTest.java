package test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import exercicios.GeraEscada;

public class GeraEscadaTest {
    GeraEscada geraEscada = Mockito.spy(GeraEscada.class);

    @Test
    public void geracaoEscadaCorreta() {
        String expected = "  *\n"
                + " **\n"
                + "***\n";
        String result = geraEscada.gerarEscada(3);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void geracaoEscadaIncorreta() {
        String expected = "*"
                + "**"
                + "***";
        String result = geraEscada.gerarEscada(3);

        Assert.assertNotEquals(expected, result);
    }
}
