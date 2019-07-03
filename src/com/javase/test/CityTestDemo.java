package com.javase.test;

import com.java.beans.City;

public class CityTestDemo {
    public static void main(String[] args) {
        City city = new City();
        city.setName("北京");
        city.setName("上海");
        System.out.println(city.toString());
    }
}
