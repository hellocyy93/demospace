package com.javase.test;

public class StringTest {
    public static void main(String[] args) {
        String sb = "cyychen";
        //从索引号2开始到索引好4结束（并且不包含索引4截取在内，也就是说实际截取的是2和3号字符）；
        String sub1 = sb.substring(2, 4);
        System.out.println(sub1);
        String sub2 = sb.substring(1);
        System.out.println(sub2);

        String replace = sb.replace("cy", "he");
        System.out.println(replace);

        String str = "123456789";
        String str3 = str.substring(str.length() - 4, str.length());
        System.out.println(str.length());
        System.out.println(str3);
    }
}
