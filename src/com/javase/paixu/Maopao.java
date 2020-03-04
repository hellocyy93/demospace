package com.javase.paixu;

public class Maopao {
    /**
     * a、冒泡排序，是通过每一次遍历获取最大/最小值
     * b、将最大值/最小值放在尾部/头部
     * c、然后除开最大值/最小值，剩下的数据在进行遍历获取最大/最小值
     * d、代码实现
     */
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2};
       /* for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
               if (arr[j] > arr[j +1]) {
                   int temp = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;
               }
                System.out.println("第"+ (i +1) +"遍" + ",第" + (j + 1) + "轮");
                printArr(arr);
                System.out.println();
            }
        }*/

       //冒泡排序 从大到小
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    printArr(arr);
                    System.out.println();
                }
            }
        }
    }
    private static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
