package com.example.learnjava;

public class JavaFunctionPmAddMethod {
    public static void main(String[] args) {
        anotherMethod("EGG", 13 );
        addNumbers(2, 6);
        multNumbers(3, 2);
        divideNumbers(4, 2);
    }

    public static void anotherMethod(String something, int quant){
        if (quant > 12) {
            System.out.println("You got a discount! and your item is: " + something + ". and Quantity is: " + quant + ".");
        } else {
            System.out.println("Another Item " + something + ". Quantity is: " + quant + ".");
        }
    }

    public static void addNumbers(int a, int b) {
        int total = a + b;
//        System.out.println("Total is: " + (a + b));
        System.out.println("Total is: " + total);
    }
    public static void multNumbers(int a, int b) {
        int product = a * b;

        System.out.println("product is: " + product);
    }

    public static void divideNumbers(int a, int b) {
        int divide = a / b;
        System.out.println("divide is: " + divide);
    }



}
