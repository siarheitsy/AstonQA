import org.factorial.Factorial;
import org.factorial.OutOfRangeFactorialNumberException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialOfOutOfRangeNumberTest {

    @DataProvider
    public static Object[][] getInvalidData() {
        return new Object[][]{{-1}, {10001}};
    }

    @Test(groups = {"validation"}, description = "Factorial handling negative number and number exceedeng upper limit test", dataProvider = "getInvalidData")
    public void factorialOfOutOfRangeNumberTest(int inputValue) {
        Assert.assertThrows(OutOfRangeFactorialNumberException.class, () -> Factorial.factorial(inputValue));
    }

}
