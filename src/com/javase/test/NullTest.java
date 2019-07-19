package com.javase.test;

import com.java.beans.City;
import org.junit.Test;

public class NullTest {
    public static City city;
    @Test
    public void testdemo() {
        if ("1" == city.getCode()) {
            System.out.println("1111111111111111111");
        } else {
            System.out.println(city.getCode());
        }
    }

    public static void main(String[] args) {
        if ("1" == city.getCode()) {
            System.out.println("1111111111111111111");
        } else {
            System.out.println(city.getCode());
        }
    }

}
