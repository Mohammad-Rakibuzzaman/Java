package com.example.learnjava.oop;

//public is modifier here
//whole Microphone class is a blueprint of Microphone object
public class Microphone {
    //instance variables/ properties/ fields
    private String name;
    private String color;
    private int model;

    //to get the implicit constructor again, thats mean to make constructor for each new object
    public Microphone(){}

    //creating constructor is the good way also we can create object and do that like previously. this is efficient
    //create constructor shortcut command (Alt + insert)

    // --------------constructor-------------------
    public Microphone(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    //we can create as much constructor as possible by using overloading constructors
    public Microphone(String name, int model){
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    //getter and setter is used for making things private make sure not accessable by everyone
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    //Actions/behaviors methods

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
