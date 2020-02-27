package com.java.common;

import com.java.beans.Animal;
import org.junit.Test;

public class CommonTest extends CommonPhone {

    @Test
    public void  test() {
        CommonTest commonTest = new CommonTest();
        commonTest.service("华为");
    }

    @Override
    public Object process(String str) {
        System.out.println("haha");
        return "haha";
    }
    @Test
    public void  test1() {
        Animal animal = new Animal();
    }

}
