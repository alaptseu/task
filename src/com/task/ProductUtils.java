package com.task;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

/**
 * @author Alex L.
 */
public final class ProductUtils {

    private ProductUtils() {
    }

    public static BigInteger calculateSum(BigInteger n, BigInteger c) {
        BigInteger sum = ZERO;
        for (BigInteger i = ZERO; i.compareTo(n) < 0; i = i.add(ONE)) {
            BigInteger product = calculateProduct(i, i.subtract(ONE), c);
//            System.out.println(product);
            sum = sum.add(product);
        }
        return sum;
    }

    private static BigInteger calculateProduct(BigInteger i, BigInteger j, BigInteger c) {
        if (j.compareTo(ZERO) < 0) {
            return ZERO;
        }
        if (j.compareTo(ZERO) == 0) {
            return ONE;
        }
        if ((i.subtract(j).compareTo(c)) <= 0) {
            return j.add(ONE).multiply(calculateProduct(i, j.subtract(ONE), c));
        } else {
            return ONE;
        }
    }

}
