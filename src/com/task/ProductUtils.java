package com.task;

import java.math.BigInteger;

/**
 * @author Alex L.
 */
public final class ProductUtils {

    private ProductUtils() {
    }

    public static BigInteger calculateSum(BigInteger n, BigInteger c) {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            BigInteger product = calculateProduct(i, i.subtract(BigInteger.ONE), c);
            System.out.println(product);
            sum = sum.add(product);
        }
        return sum;
    }

    private static BigInteger calculateProduct(BigInteger i, BigInteger j, BigInteger c) {
        if (j.compareTo(BigInteger.ZERO) < 0) {
            return BigInteger.ZERO;
        }
        if (j.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ONE;
        }
        if ((i.subtract(j).compareTo(c)) <= 0) {
            return j.add(BigInteger.ONE).multiply(calculateProduct(i, j.subtract(BigInteger.ONE), c));
        } else {
            return BigInteger.ONE;
        }
    }

}
