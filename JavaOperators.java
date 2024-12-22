package com.example.learnjava;

public class JavaOperators {
    public static void main(String[] args) {

        /*
            This is another
            way to do
            comments
         */
        //Java Operators

        double a = 12;
        double b = 7;

        int sum = (int) (a + b);
        int diff = (int) (a - b);
        int mult = (int) (a * b);
        double quot = a / b;

        //remainder = % ---> "what remains after division"
        double remainder = a % b;


        System.out.println("THe sum is " + sum);
        System.out.println("THe difference is " + diff);
        System.out.println("THe product is " + mult);
        System.out.println("THe quotient is " + quot);
        System.out.println("THe remainder is " + remainder);


    }
}
