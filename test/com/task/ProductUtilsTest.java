package com.task;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import static com.task.ProductUtils.calculateSum;
import static java.lang.String.format;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author Alex L.
 */
public class ProductUtilsTest {

    @Test
    public void test1(){
        BigInteger n = new BigInteger("5");
        BigInteger c = new BigInteger("2");
        BigInteger sum = calculateSum(n, c);
        out.println(format("n=%s c=%s = %s", n, c, sum));
        assertEquals(new BigInteger("21"), sum);
    }


    @Test
    public void test2(){
        BigInteger n = new BigInteger("100");
        BigInteger c = new BigInteger("10");
        BigInteger sum = calculateSum(n, c);
        out.println(format("n=%s c=%s = %s", n, c, sum));
        assertEquals(new BigInteger("513946235090696089113"), sum);
    }

    //this may take a while...
    @Test
    public void test3(){
        BigInteger n = new BigInteger("1000000");
        BigInteger c = new BigInteger("200");
        BigInteger sum = calculateSum(n, c);
        out.println(format("n=%s c=%s = %s", n, c, sum));
        assertEquals("4876116127", sum.toString().substring(0,10));
    }

}
