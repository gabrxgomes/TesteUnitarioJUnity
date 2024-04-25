package calculate;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestClass {

	@Test
    public void testSoma() {
        Calculator calc = new Calculator();
        int a = 20;
        int b = 20;
        int expectedResult = 50; // Esperado resultado da soma de 20 + 20
        int actualResult = calc.soma(a, b);
        assertEquals(expectedResult, actualResult);
    }

}
