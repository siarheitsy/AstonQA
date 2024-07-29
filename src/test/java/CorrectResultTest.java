import org.factorial.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class CorrectResultTest {

    @Test(groups = {"validation"}, description = "Factorial result with correct input number test")
    public void correctResultWith7Test() {
        int factorialOfSeven = 5040;
        BigInteger result = Factorial.factorial(7);
        Assert.assertTrue(BigInteger.valueOf(factorialOfSeven).compareTo(result) == 0);
    }

}
