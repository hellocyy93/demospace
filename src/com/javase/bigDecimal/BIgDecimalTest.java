package com.javase.bigDecimal;

import java.math.BigDecimal;

public class BIgDecimalTest {
    public static void main(String[] args) {
        BigDecimal number = BigDecimal.ZERO;
        number = number.add(new BigDecimal("10.00"));
        System.out.println(number);
    }
}
