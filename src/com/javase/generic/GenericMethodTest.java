package com.javase.generic;

public class GenericMethodTest {
    public static <E> void printArr(E [] inputArr) {
        for (E element : inputArr) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("整数数组: ");
        printArr(intArray);
        System.out.println("float数组: ");
        printArr(doubleArray);
        System.out.println("字符数组: ");
        printArr(charArray);
    }
}
