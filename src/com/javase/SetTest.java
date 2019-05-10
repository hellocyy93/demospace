package com.javase;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("33");
        set.add("11");
        set.add("22");
        set.add("22");
        Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
