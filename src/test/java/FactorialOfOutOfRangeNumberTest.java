import org.factorial.Factorial;
import org.factorial.OutOfRangeFactorialNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;

public class FactorialOfOutOfRangeNumberTest {

    @DisplayName("Factorial handling negative number and number exceedeng upper limit test")
    @ParameterizedTest
    @ValueSource(ints = {-1, 10001})
    public void factorialOfOutOfRangeNumberTest(int inputValue) {
        Exception exception = Assertions.assertThrows(OutOfRangeFactorialNumberException.class, () -> Factorial.factorial(inputValue));
        String expectedExceptionMessage = "Выход за пределы отрезка чисел, подходящих для расчета факториала [0, 10000]";
        Assertions.assertEquals(expectedExceptionMessage, exception.getMessage());
    }

}
