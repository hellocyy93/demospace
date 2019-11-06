package com.javase.objectDemo;

import com.java.beans.City;
import org.junit.Test;

public class ObjectTest {

    @Test
    public void test1() {
        City city = new City();
        setValue(city);
        System.out.println(city.toString());
    }

    private void setValue(City city) {
        city.setName("Beijing");
        city.setCode("001");
    }
}
