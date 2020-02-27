package com.javase.listDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
       // System.out.println(hashSet.size());

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
       /* for (int set : linkedHashSet) {
            System.out.println(set);
        }*/
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        for(int set : treeSet) {
            System.out.println(set);
        }
        System.out.println(0 / 10);
    }
}
