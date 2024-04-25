package calculate;
import org.junit.Test;
import org.junit.Assert;

public class TestCalculator {

    public Calculator cal = new Calculator();

    @Test
    public void testSoma() {
        Calculator calc = new Calculator();
        int a = 20;
        int b = 20;
        int expectedResult = 40; // Esperado resultado da soma de 20 + 20
        int actualResult = calc.soma(a, b);
        Assert.assertEquals(40, actualResult);
    }

}
