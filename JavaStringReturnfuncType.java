package com.example.learnjava;

public class JavaStringReturnfuncType {
    public static void main(String[] args) {
//        double item = divideNumbers(3, 5);
//        item += 2;
//        System.out.println("Result is: " + item + "!");
        System.out.println(showBio("Ratul","Bangladesh", 27));

        JavaStringReturnfuncType genderIdentifier = new JavaStringReturnfuncType();
        System.out.println(genderIdentifier.showGender("Male"));




    }
    public static double divideNumbers(double first, int second){

        return (first/second);
    }

    public static String showBio(String name, String bio, int age){
//        String description = "My name is :" + name
//                    + ". I am from: " + bio + ". I am " + age + " years old.";
        return "My name is: " + name
                + ". I am from: " + bio + ". I am " + age + " years old.";
    }

    public String showGender(String gender){

        return "You are a " + gender + ".";
    }



}
