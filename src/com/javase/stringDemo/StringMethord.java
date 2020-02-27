package com.javase.stringDemo;

public class StringMethord {
    public static void main(String[] args) {
        String str = "0120#200224";
        //String 截取前两位 substring(start, end) start开始到end-1
        System.out.println(str.substring(0,2));
        //String 进行分割
        String[] split = str.split("#");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //equals()方法
        //str.charAt()方法 返回对应索引元素
        System.out.println(str.charAt(0));
        //trim()去空格



    }
}
