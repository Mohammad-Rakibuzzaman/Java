package com.example.learnjava;

public class JavaForLoop {
    public static void main(String[] args) {
        
        //can also initialize i = 0 before the for loop statement
        /*

        int i = 0;
        for (; i < 1000; i++) // must have to put semicolon

         */
         for (int i = 0; i < 1000; i++) {

            if ( i % 2 == 0) {
                System.out.println( i + " is a multiple of 2");
            }
        }



    }
}
