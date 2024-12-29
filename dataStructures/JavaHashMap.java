package com.example.learnjava.dataStructures;


//import java.util.HashMap;

import java.util.HashMap; //automatic by IDE

public class JavaHashMap {

    //for key value pairs we use java hashmap such as python dictionary

    public static void main(String[] args) {
        /* in hashmap we must pass (values or objects) so we wont pass primitive type int.
         we should use class not primitive type like Integer, String etc
        */

        HashMap<String, Integer> gameStats = new HashMap<>();

        gameStats.put("Ratul", 2700);
        gameStats.put("Rakib", 3700);
        gameStats.put("Mohammad Rakib Ratul", 5700);

//        gameStats.clear();
//        gameStats.remove("Rakib");


        //Hashmap doesnt follow any order. Thats mean its unorder
        //in array or array list we used to pass index inside of get
        //but now in hashmap we use object or key
        //here object is a String object so we get key of Rakib which is 3700

//        System.out.println(gameStats.get("Mohammad Rakib Ratul"));

//        System.out.println(gameStats.size());

        //foreach loop
        for (String item : gameStats.keySet()) {
            System.out.println(item);
        }

        System.out.println("+++++++++++++++++++++++++");

        for (int item : gameStats.values()) {
            System.out.println(item);
        }

        System.out.println("+++++++++++++++++++++++++");

        for (String item : gameStats.keySet()) {
            System.out.println("Key: " + item + " value: " + gameStats.get(item));

        }

    }



}
