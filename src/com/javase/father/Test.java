package com.javase.father;

public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        if (father.fatherName == null) {
            father.fatherName = "jack";
        }
        System.out.println(father.fatherName);
        father.hello();
    }
}
