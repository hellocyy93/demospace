package com.test;

import org.junit.Test;

public class JUnitDemo {
    @Test(expected=ArithmeticException.class)
    public void test1() {
        int i = 1 / 0;
        System.out.println("hhhh");
    }

    @Test(timeout = 10)
    public void test2() {
        while (true) {
            System.out.println("1");
        }
    }

}
