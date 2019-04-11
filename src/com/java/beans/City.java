package com.java.beans;

import java.io.Serializable;

public class City implements Serializable {
    private static final long serialVersionUID = -6599117100970360245L;
    private String name;
    private String code;
    private String desc;
    private float housePrice;
    public City() {}
    public City(String name, String code, String desc, float housePrice) {
        this.name = name;
        this.code = code;
        this.desc = desc;
        this.housePrice = housePrice;
    }

    public float getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(float housePrice) {
        this.housePrice = housePrice;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", housePrice=" + housePrice +
                '}';
    }
}
