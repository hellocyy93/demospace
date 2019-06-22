package com.java.beans;

public class Bens {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
