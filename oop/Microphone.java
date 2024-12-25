package com.example.learnjava.oop;

//public is modifier here
//whole Microphone class is a blueprint of Microphone object
public class Microphone {
    //instance variables/ properties/ fields
    String name;
    String color;
    int model;

    //creating constructor is the good way also we can create object and do that like previously. this is efficient
    //create constructor shortcut command (Alt + insert)

    public Microphone(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }


    //Actions methods

    public void turnOff() {
        System.out.println( this.name + " Turn Off");
    }
    public void turnOn() {
        System.out.println( this.name + " Turn On");
    }
    public void setVolume() {
        System.out.println( this.name + " Setting Volume");
    }

    public String showDescription() {
        return "Microphone name " + this.name + " with color: " + this.color
                    + " and its model " + this.model;
    }



}
