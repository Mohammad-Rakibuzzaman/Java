package com.example.learnjava.excercises;

public class DivideMultiplyInt {
    public static void main(String[] args) {
        System.out.println(divideNumbers(10, 7));
        System.out.println(multiplyNumbers(10, 7));

    }

    public static int divideNumbers(int a, int b){
        return (a % b);
    }
    public static int multiplyNumbers(int a, int b){
        return (a * b);
    }

}
