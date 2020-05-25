import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculadora.class)
public class CaculadoraTest {

    @Test
    public void mock() throws Exception {
        Calculadora calc = new Calculadora();
        final String METHOD = "somar";

        Calculadora spy = PowerMockito.spy(calc);
            PowerMockito.when(spy, METHOD).thenReturn((int) 10);

        int atual = 0;
        int esperado = 20;

        atual = spy.somar(5, 5);

        // act
        Assert.assertEquals(esperado, atual);

        PowerMockito.verifyPrivate(spy, Mockito.times(1)).invoke(METHOD);
    }

    @Test
    public void somarValorPositivo () {
        //arrange
        Calculadora calc = new Calculadora();
        int atual = 0;
        int esperado = 2;
        //act
        atual = calc.somarPositivo(-3, 5);

        //assert
        Assert.assertEquals(esperado, atual);
    }


    //DESVIO E CONDIÇÃO
    @Test
    public void somarValorNegativo() {
        //arrange
        Calculadora calc = new Calculadora();
        int atual = 0;
        int esperado = -8;
        //act
        atual = calc.somarPositivo(-3, -5);

        //assert
        Assert.assertEquals(esperado, atual);
    }


    @Test
    public void subtrairValorPositivo() {
        //arrange
        Calculadora calc = new Calculadora();
        int atual = 0;
        int esperado = 2;
        //act
        atual = calc.subtrair(5, 3);

        //assert
        Assert.assertEquals(esperado, atual);
    }
     @Test
    public void subtrairValorNegativo() {
        //arrange
        Calculadora calc = new Calculadora();
        int atual = 0;
        int esperado = -8;

        //act
        atual = calc.subtrair(-3, 5);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void multiplicarValor() {
        //
        Calculadora calc = new Calculadora();
        int atual = 0;
        int esperado = 20;
        //act
        atual = calc.multiplicar(2, 10);

        //assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void dividirValor() {
        //arrange
        Calculadora calc = new Calculadora();
        int atual = 0;
        int esperado = 5;
        //act
        atual = calc.dividir(10, 2);

        //assert
        Assert.assertEquals(esperado, atual);
    }
}
