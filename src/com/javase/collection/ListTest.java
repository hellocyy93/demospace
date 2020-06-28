package com.javase.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public void test1() {
        ArrayList<Object> list = new ArrayList<>();
        doAddList(list);
        for (Object object : list) {
            System.out.println(object);
        }
    }

    private void doAddList(ArrayList<Object> list) {
        list.add(1);
        list.add(2);
    }

    @Test
    public void test2() {
        List<String> aCaseIdBatchIdList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (aCaseIdBatchIdList.contains("abc")) {
                System.out.println("end");
                break;
            }
            aCaseIdBatchIdList.add("abc");
            System.out.println("第" + i);
        }
    }

}
