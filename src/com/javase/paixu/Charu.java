package com.javase.paixu;

public class Charu {
    /**
     * 　a、默认从第二个数据开始比较。
     *
     * 　b、如果第二个数据比第一个小，则交换。然后在用第三个数据比较，如果比前面小，则插入（狡猾）。否则，退出循环
     *
     * 　c、说明：默认将第一数据看成有序列表，后面无序的列表循环每一个数据，如果比前面的数据小则插入（交换）。否则退出。
     *
     * 　d、代码实现
     */
    public static void main(String[] args) {
        int arr[] = {7, 5, 8};

        //插入排序
        for (int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    // 2 1   1 0
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    printArr(arr);
                    System.out.println();
                } else {
                   break;
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
