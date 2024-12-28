package com.example.learnjava.dataStructures;

public class array {
    public static void main(String[] args) {

        //creating and looping through arrays
        int[] myAarray = {100, 22, 124, 541, 21,56}; //length = 6
        String[] names = {"Eve", "Siam", "Mitul", "Ichay", "Lee", "Hiory"};

        System.out.println(myAarray[5]);
        System.out.println(names[2]);

        for (int i = 0; i < myAarray.length; i++){
            System.out.println("Items: " + myAarray[i]);

        }
        System.out.println("-------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Items: " + names[i]);
        }


    }
}
