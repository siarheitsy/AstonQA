import org.factorial.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialOfZeroTest {

    @Test(groups = {"functional"}, description = "Factorial result with zero input number test")
    public void factorialOfZeroTest() {
        try {
            BigInteger result = Factorial.factorial(0);
            Assert.assertTrue(result.compareTo(BigInteger.ONE) == 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
