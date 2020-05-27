package com.javase.test;

import com.java.beans.Mouse;
import org.junit.Test;

import java.util.Random;

public class BaseTest {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.setName("ceshi");
        if (0 != mouse.getNums()) {
            System.out.println("---------------");
        }
    }

    @Test
    public void testNextRandom() {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(99));
        }
    }
}
