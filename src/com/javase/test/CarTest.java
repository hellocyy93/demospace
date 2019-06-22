package com.javase.test;

import com.java.beans.Bens;
import com.java.beans.Car;

public class CarTest {
    public static void main(String[] args) {
        Bens bens = new Bens();
        Car car = new Car();
        car.setBens(bens);
        System.out.println(car);
    }
}
