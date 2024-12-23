package com.example.learnjava;

public class JavaDoWhile {
    public static void main(String[] args) {

        int limit = 10;
        int counter = 1;

//
//        do {
//            System.out.println("we keep counting...");
//            counter++;
//        }while (counter < limit); //run atleast 1 time for false condition
        //while (counter < limit);

        while (counter < limit){

            System.out.println("we keep counting...");
            counter++;
        }
    }
}
