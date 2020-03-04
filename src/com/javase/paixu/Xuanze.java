package com.javase.paixu;

public class Xuanze {
    /**
     * 　　a、将第一个值看成最小值
     *
     * 　　b、然后和后续的比较找出最小值和下标
     *
     * 　　c、交换本次遍历的起始值和最小值
     *
     * 　　d、说明：每次遍历的时候，将前面找出的最小值，看成一个有序的列表，后面的看成无序的列表，
     *       然后每次遍历无序列表找出最小值。
     *
     * 　　e、代码实现
     *
     */
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                    System.out.println("第" + (i + 1) + "轮" + "第" + j + "次" + "index=" + index);
                }
            }
            if (i != index) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
