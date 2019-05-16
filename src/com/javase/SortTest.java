package com.javase;

/**
 * @author chenyy
 * @version V1.0.0
 * @company lhfinance.com
 * @description: 冒泡 选择 插入
 * @className: SortTest.java
 * @package com.javase.test
 * @date 2019/4/29 14:32
 */
public class SortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{55, 33, 22, 44, 11};
        System.out.println("原始数据:  ");
        printArr(arr);
        System.out.println();
        /**
         * 冒泡排序
         * 两个数相比较,交换位置,大的数排在后面
         */
        /*for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "遍: ");
            printArr(arr);
            System.out.println();
        }*/
        /**
         * 选择排序
         * 每次循环假定最左边数最小 依次比较 大于假定最小数值就交换位置
         */
      /*  for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for(int j = k + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (i != k) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
            System.out.println("第" + (i + 1) + "遍: ");
            printArr(arr);
            System.out.println();
        }*/
        /**
         * 插入排序
         * 排序思想:
         * 需要进行N-1轮排序,每一轮排序会拿第N+1个数与前面排好序的数组依次比较,小于前面元素,就交换位置
         */
        int j;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
            System.out.println("第" + (i) + "遍: ");
            printArr(arr);
            System.out.println();
        }

    }
    private static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

}

