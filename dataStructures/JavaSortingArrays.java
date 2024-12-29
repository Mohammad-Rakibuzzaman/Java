package com.example.learnjava.dataStructures;

import java.util.Arrays;

public class JavaSortingArrays {

    public static void main(String[] args) {

        int[] arr = {3, 124, 12, -1, 2};

        System.out.println("---------------------x-----------------------");
        System.out.println("---------------------x-----------------------");
        System.out.println("Sorting Integer");
        System.out.println("+++++++++++++++");
        System.out.println("BEFORE SORT");
        System.out.println("+++++++++++++++");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("+++++++++++++++");
        System.out.println("AFTER SORT");
        Arrays.sort(arr);
        System.out.println("+++++++++++++++");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("---------------------x-----------------------");

        String[] names = {"Ratul", "Annie", "Anika", "Ichay", "Zaima"};
        System.out.println("+++++++++++++++");
        System.out.println("Sorting String");
        System.out.println("+++++++++++++++");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("+++++++++++++++");
        System.out.println("AFTER SORT");
        Arrays.sort(names);
        System.out.println("+++++++++++++++");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("---------------------x-----------------------");


    }


}
