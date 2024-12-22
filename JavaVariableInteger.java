package com.example.learnjava;

public class JavaVariableInteger {
    public static void main(String[] args) {
        //categories

        //First category

        //Boolean and char
        String name = "Ratul"; // can use unlimited texts
        char letter = 'c'; //must declare inside of single quote and not more than 1 char

        //Second category

        // Numeric category
        int age = 27;
        int year = 1997123124; //32 bit
        long bigNumber = 199712312412421512L; //for store higher number
        // byte holds 8bit . can store maximum threshold 127 to -128 . 128 will show error
        byte myByte = 127;
        // short holds 16 bit
        short myShort = 289;


        //Floating Point
        float celcius = 20.5f; //Decimal number. 32 bit
        // FORcapacity and precise should use double
        double height = 5.7; // 64 bits (use if you need more precision) . can declare d also after



        System.out.println("I'm "+name+" and I'm "+age+" years old.");
        System.out.println(year);
        System.out.println(bigNumber);
        System.out.println(celcius);
        System.out.println(height);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(letter);


    }
}
