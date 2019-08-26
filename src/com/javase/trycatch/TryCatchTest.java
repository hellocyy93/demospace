package com.javase.trycatch;

import org.junit.Test;

public class TryCatchTest {
    int abc;
    @Test
    public void demo1 () {

        try {
            abc = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(abc);
    }
}
