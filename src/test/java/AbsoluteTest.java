import org.junit.Assert;
import org.junit.Test;

public class AbsoluteTest {
    @Test
    public void testarValorAbsolutoPositivo() {
        //arrange
            Absoluto abs = new Absoluto();
            int esperado = 2;
            int atual = 0;

        //act
            atual = abs.retornaValorAbsoluto(-2);

        //assertEquals
        Assert.assertEquals(esperado, atual);
    }

}
