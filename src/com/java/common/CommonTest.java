package com.java.common;

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
}
