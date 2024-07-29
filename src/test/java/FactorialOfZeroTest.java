import org.factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.math.BigInteger;

public class FactorialOfZeroTest {

    @DisplayName("Factorial result with zero input number test")
    @Test
    public void factorialOfZeroTest() {
        BigInteger result = Factorial.factorial(0);
        Assertions.assertEquals(0, result.compareTo(BigInteger.ONE));
    }

}
