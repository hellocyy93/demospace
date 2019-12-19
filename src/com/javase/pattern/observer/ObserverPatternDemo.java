package com.javase.pattern.observer;

/**
 * 观察者模式
 * author by Yuanyuan Chen
 * 2019.12.19
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
      /*  new OctalObserver(subject);
        new BinaryObserver(subject);*/

        System.out.println("First state change: 15");
        subject.setState(8);
       /* System.out.println("Second state change: 10");
        subject.setState(10);*/
    }
}
