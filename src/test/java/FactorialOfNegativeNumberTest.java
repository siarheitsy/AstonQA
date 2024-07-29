import org.factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.math.BigInteger;

public class FactorialOfNegativeNumberTest {

    @DisplayName("Factorial handling number exceedeng lower limit test")
    @ParameterizedTest
    @ValueSource(ints = {-1, -10, -100, -1000})
    public void negativeNumberTest(int value) {
        BigInteger result = Factorial.factorial(value);
        Assertions.assertNull(result);
    }

}
