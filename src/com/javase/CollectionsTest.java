package com.javase;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = {112, 111, 23, 456, 231 };
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        ArrayList<Integer> li = new ArrayList<>();
        int[] array2 = {1, 2, 3, 4, 5 };
        for (int i = 0; i < array2.length; i++) {
            li.add(array2[i]);
        }
//        Collections.sort(list);
//        Collections.shuffle(list);
//        Collections.reverse(list);
//        Collections.fill(list,101);
//        Collections.copy(li,list);
        System.out.println(Collections.min(list));
        for (int temp : list) {
            System.out.println(temp);
        }

    }
}
