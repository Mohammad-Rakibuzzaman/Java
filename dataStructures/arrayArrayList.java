package com.example.learnjava.dataStructures;

import java.util.ArrayList;

public class arrayArrayList {
    public static void main(String[] args) {

        //creating and looping through arrays
        int[] myAarray = {100, 22, 124, 541, 21,56}; //length = 6
        String[] names = {"Eve", "Siam", "Mitul", "Ichay", "Lee", "Hiory"};

//        System.out.println(myAarray[5]);
//        System.out.println(names[2]);


        int[] newArray = new int[6];
        String[] newNames = new String[6];




        newArray[0] = 513;
        newArray[1] = 132;
        newArray[2] = 153;
        newArray[3] = 213;

        System.out.println(newArray.length);
        System.out.println(newArray[2]);

        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);

        }

        System.out.println("----------------------------------");


        for (int i = 0; i < myAarray.length; i++){
            System.out.println("Items: " + myAarray[i]);

        }
        System.out.println("-------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Items: " + names[i]);
        }

        System.out.println("++++++++++++Array List++++++++++++");

        //go straight bookmarked library class of java site and find java.utils package there we can find our arraylist

//        ArrayList<String> name = new ArrayList<>();

        ArrayList xnamex = new ArrayList();
        xnamex.add("Mahiya Sheikh");
        xnamex.add(10);
        xnamex.add("Nahiya Nahasharma");
        xnamex.add(12);
        xnamex.add("Zaima");
        xnamex.add(15);
//        System.out.println(xnamex.get(2));
//        System.out.println(xnamex.get(3));

        for (int i = 0; i < xnamex.size(); i++) {
            System.out.println("Names and ID's: " + xnamex.get(i));
        }


        //clever for loop
        for (Object i : xnamex) {

            System.out.println(i);

        }









    }
}
