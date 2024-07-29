package org.factorial;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int inputValue) {
        if (inputValue >= 0 && inputValue <= 10000) {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= inputValue; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
        } else {
            return null;
        }
    }
}
