package com.javase.stringDemo;

public class Test {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.hashCode());
        String str2 = "world";
        System.out.println(str2.hashCode());
        //截取字符串
        String str3 = "[my]world";
        System.out.println(str3.indexOf("]"));
        //截取前两位
        System.out.println(str3.substring(0, (str3.indexOf("]")) + 1));
        //截取后3位
        System.out.println(str3.substring((str3.indexOf("]")) + 1));
        //分割字符串
        /*String address="上海@上海市@浦东新区@张江";
        String[] splitAddr=address.split("@");
        System.out.println(splitAddr[0]+splitAddr[1]+splitAddr[2]+splitAddr[3]);*/
        /*当使用* ^ : | . \等6个符号做分隔符时，上述6个符号转义字符,必须得加"\\"，即split(“\\^”)等。第二个“\”
        是用来给这6种符号转义，第一个“\”是用来给第二个“\”转义
        */
        /*String address2="上海*上海市*浦东新区#浦东软件园";
        String[] splitAddr2=address2.split("\\*|#");
        System.out.println(splitAddr2[0]+splitAddr2[1]+splitAddr2[2]);*/
    }
}
