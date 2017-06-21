package com.task;

import java.math.BigInteger;

import static com.task.ProductUtils.calculateSum;
import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

public class Main {
    public static void main(String[] args) {
        requireNonNull(args);
        if (args.length < 2) {
            throw new IllegalArgumentException("Should be 2 arguments, ex. 5 2");
        }
        BigInteger n = new BigInteger(args[0]);
        BigInteger c = new BigInteger(args[1]);
        System.out.println(format("N=%s", n));
        System.out.println(format("C=%s", c));
        System.out.println(calculateSum(n, c));
    }
}
