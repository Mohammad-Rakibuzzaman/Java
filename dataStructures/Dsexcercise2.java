package com.example.learnjava.dataStructures;

import java.util.Arrays;

public class Dsexcercise2 {

    public static void main(String[] args) {
        Dsexcercise2 findmultiply = new Dsexcercise2();
        int[] arr = {123, 10, 11, 89, 100, 89, 10, 999, 25, 24};
//        findmultiply.multiplyNumbers(arr);
        String result = findmultiply.multiplyNumbers(arr);
        System.out.println(result);
    }

//    public void multiplyNumbers(int[] numbers){
//
////        int[] numbers = { 123, 10, 11, 89, 100, 89, 10, 999, 25, 24 };
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            if (numbers[i] % 3 == 0) {
//                System.out.println(numbers[i]);
//
//            }
//
//        }
//
//
//    }

    public String multiplyNumbers(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            if (number % 3 == 0) {
                result.append(number);
            }

        }

//        String convertres = new String(result);
//        return  convertres;
        return result.toString(); //conventional and correct way to convert stringbuilder


    }



}
