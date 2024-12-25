package com.example.learnjava.excercises;

public class DivideMultiplyInt {
    public static void main(String[] args) {
        System.out.println(divideNumbers(30, 5));
        System.out.println(multiplyNumbers(10, 7));

    }
//Todo: create a divideNumbers() and multiplyNumbers()
    public static double divideNumbers(double a, int b){
        return (a / b);
    }
    public static int multiplyNumbers(int a, int b){
        return (a * b);
    }

}
