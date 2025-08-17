import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfFive() {
        // Проверяем, что факториал 5 равен 120
        assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeInput() {
        // Проверяем, что при отрицательном числе выбрасывается исключение
        FactorialCalculator.factorial(-1);
    }
}