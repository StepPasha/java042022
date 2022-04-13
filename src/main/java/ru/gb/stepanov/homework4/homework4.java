package ru.gb.stepanov.homework4;

public class homework4 {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
       int value = 200;

       if (value <= 0) {
           System.out.println("red");
       }
       if (value > 0 && value <=100) {
           System.out.println("yellow");
       }
       if (value > 100) {
           System.out.println("green");
       }

    }
}
