package com.javase.test;

import org.junit.Test;

public class BianLiang {
    private boolean isOk = false;
    static boolean isHey = true;
    int y;
    public void  test() {
        if(isOk == false) {
            isOk = true;
        }
        if(isHey == true) {
            isHey = false;
        }
    }
    public void  demo() {
        System.out.println("isOk:" + isOk);
        System.out.println("isHey:" + isHey);
    }
    @Test
    public void action(){
        test();
        demo();
        int i = 0;
        i++;
        System.out.println(i);
        System.out.println(y);

    }

}
