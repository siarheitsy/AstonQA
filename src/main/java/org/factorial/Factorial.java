package org.factorial;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int inputValue) throws OutOfRangeFactorialNumberException {
        if (inputValue >= 0 && inputValue <= 10000) {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= inputValue; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
        } else {
            throw new OutOfRangeFactorialNumberException("Выход за пределы отрезка чисел, подходящих для расчета факториала [0, 10000]");
        }
    }
}
