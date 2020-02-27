package com.javase.threadDemo;

public class MainClass {
    public static void main(String[] args) {
        SaleTicket saleTicket1 = new SaleTicket("Win-1");
        SaleTicket saleTicket2 = new SaleTicket("Win-2");
        SaleTicket saleTicket3 = new SaleTicket("Win-3");

        saleTicket1.start();
        saleTicket2.start();
        saleTicket3.start();
    }
}
