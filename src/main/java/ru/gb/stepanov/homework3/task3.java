package ru.gb.stepanov.homework3;

public class task3 {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 16;
        int b = 8;

        if (a + b >= 0 ) {
            System.out.println("The amount is positive");
        }else if (a + b <= 0) {
            System.out.println("The amount is negative");
        }
    }
}