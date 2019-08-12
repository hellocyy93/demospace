package com.javase.test;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        int j;
        j = 1;
        BigDecimal bigDecimal1 = new BigDecimal("2.00");
        BigDecimal bigDecimal2 = new BigDecimal("2.00");
        BigDecimal bigDecimal3 = new BigDecimal("2.00");
        BigDecimal sum = bigDecimal1.add(bigDecimal2).add(bigDecimal3);
        System.out.println(sum);
        System.out.println(j);
    }
}
