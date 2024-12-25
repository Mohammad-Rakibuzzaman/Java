package com.example.learnjava.oop;

public class Hero extends PersonInheritance {
    int Power;

    public Hero(String name, int age, int power) {
        super(name, age); //here we are calling the constructor of our parent class
        this.Power = power;
    }
}
