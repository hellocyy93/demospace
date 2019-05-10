package com.javase;

public class ExceptionDemo {

    public void test() throws Exception{
        int a[] = new int[2];
        System.out.println("Access element three :" + a[3]);
    }
    public static class testDemo {
        public static void main(String[] args) {
            ExceptionDemo demo = new ExceptionDemo();
            try {
                demo.test();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("抓取异常");
            }
        }
    }
}

