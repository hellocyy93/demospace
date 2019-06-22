package com.java.beans;

public class Car {
    private Toyota toyota;
    private Bens bens;

    public Toyota getToyota() {
        return toyota;
    }

    public void setToyota(Toyota toyota) {
        this.toyota = toyota;
    }

    public Bens getBens() {
        return bens;
    }

    public void setBens(Bens bens) {
        this.bens = bens;
    }
    @Override
    public String toString() {
        return "Car{" +
                "toyota=" + toyota +
                ", bens=" + bens +
                '}';
    }
}
