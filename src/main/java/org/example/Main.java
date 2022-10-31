package org.example;

public class Main {
    public static void main(String[] args) {
        final int homePrice = 8_000_000;
        final float firstPaymentPercent = 25;
        final float firstPaymentSum = homePrice * firstPaymentPercent / 100;
        System.out.println("переменная homePrice " + homePrice);
        System.out.println("переменная firstPaymentPercent " + firstPaymentPercent);
        System.out.println("переменная firstPaymentSum " + firstPaymentSum);
    }
}