import org.factorial.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialOfOutOfRangeNumberTest {

    @Test(groups = {"validation"}, description = "Factorial handling number exceedeng upper limit test")
    public void factorialOfOutOfRangeNumberTest() {
        BigInteger result = Factorial.factorial(10001);
        Assert.assertNull(result);
    }

}
