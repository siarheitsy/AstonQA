import org.factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class CorrectResultTest {

    @DisplayName("Factorial result with correct input number test")
    @Test
    public void correctResultWith7Test() {
        int factorialOfSeven = 5040;
        BigInteger result = Factorial.factorial(7);
        Assertions.assertEquals(0, BigInteger.valueOf(factorialOfSeven).compareTo(result));
    }

}
