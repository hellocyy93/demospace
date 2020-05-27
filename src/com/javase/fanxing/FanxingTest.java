package com.javase.fanxing;

public class FanxingTest {
    public static void main(String[] args) {
        MyList myList=new MyList();
        myList.setT("123");
        System.out.println(myList.getT());
    }
}
class MyList<T>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
