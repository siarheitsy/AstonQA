import org.factorial.Factorial;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialOfNegativeNumberTest {

    @Parameters({"stringValue"})
    @Test(groups = {"validation"}, description = "Factorial handling number exceedeng lower limit test")
    public void negativeNumberTest(String stringValue) {
        int value = Integer.valueOf(stringValue);
        BigInteger result = Factorial.factorial(value);
        Assert.assertNull(result);
    }

}
