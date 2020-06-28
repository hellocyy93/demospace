package com.javase.baseTest;

import org.junit.Test;

public class baseDemo {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        System.out.println(j);
        System.out.println(i);
    }
    @Test
    public void testBase() {
        int count = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(count++);
            System.out.println("=======================");
            System.out.println(count);
        }
    }
}
