package com.javase.test;

import com.java.beans.Mouse;

public class BaseTest {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.setName("ceshi");
        if (0 != mouse.getNums()) {
            System.out.println("---------------");
        }
    }
}
