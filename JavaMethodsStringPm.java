package com.example.learnjava;

public class JavaMethodsStringPm {

    public static void main(String[] args) {
        longMethod(1251515125125L);
        byteMethod((short) 129);
        shortMethod((short) 100);
        doubleMethod(110.205172727);
        floatMethod(12.21f);
        boolMethod(true);
        charactMethod('R');
        uniqueMethod("Hey!!!");

//        showAge();

    }

    public static void uniqueMethod(String something) {
        System.out.println("Another triumph! HAHAHAH "+ something);
    }

    public static void charactMethod(Character letter) {
        System.out.println("And here im ;): "+ letter);

    }

    public static void boolMethod(Boolean answer) {
        System.out.println("was it true or false?: "+ answer);
    }

    public static void floatMethod(Float floatnum) {
        System.out.println("So your price is: "+floatnum);
    }

    public static void doubleMethod(Double doublenum) {
        System.out.println("here is the price of your chocoletbar: "+doublenum);

    }

    public static void shortMethod(Short shortnum){
        System.out.println("So you have gold kgs only: "+shortnum);
    }

    public static void byteMethod(Short byteNumber){
        System.out.println("So you have gold kgs only: "+byteNumber);
    }

    public static void longMethod(Long longnumber) {
        System.out.println("Here that bank deposit is: "+longnumber);
    }





    public static void showAge() {

        for (int i = 0; i < 20; i++) {
            if(i % 3 == 0) {
                System.out.println(i + " is multiple of 3");
            }
        }
        System.out.println("My age is: 27");

    }



}
