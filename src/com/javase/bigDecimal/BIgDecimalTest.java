package com.javase.bigDecimal;

import java.math.BigDecimal;

public class BIgDecimalTest {
    public static void main(String[] args) {
      /*  BigDecimal number = BigDecimal.ZERO;
        number = number.add(new BigDecimal("10.00"));
        System.out.println(number);*/
        BigDecimal b1 = new BigDecimal("5.00");
        BigDecimal b2 = new BigDecimal("2.00");
        BigDecimal b3 = new BigDecimal("1.00");
        BigDecimal b4 = b1.subtract(b2).subtract(b3);
        System.out.println(b4);

    }
}
