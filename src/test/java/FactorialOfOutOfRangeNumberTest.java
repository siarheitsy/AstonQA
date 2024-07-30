import org.factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;

public class FactorialOfOutOfRangeNumberTest {

    @DisplayName("Factorial handling number exceedeng upper limit test")
    @ParameterizedTest
    @ValueSource(ints = {10001})
    public void factorialOfOutOfRangeNumberTest(int inputValue) {
        BigInteger result = Factorial.factorial(inputValue);
        Assertions.assertNull(result);
    }

}
