package com.example.learnjava;

public class ClassClonePractice {
    public static void main(String[] args) {

        String xiaomi = microphone(12, "xiaomi mini", "grey");
        String sony = microphone(122, "Sony hash", "pink");
        System.out.println(xiaomi);
        System.out.println(sony);

    }

    public static String microphone(int model, String name, String color){

        return "your phone model is: "+model+". name: " + name + ". Color: " + color + ".";

    }




}
