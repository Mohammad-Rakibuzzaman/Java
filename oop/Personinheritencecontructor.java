package com.example.learnjava.oop;

public class Personinheritencecontructor {
    public static void main(String[] args) {
        PersonInheritance person = new PersonInheritance("Ratul", 27);
        System.out.println(person.age);

        Hero batman = new Hero("Abequild", 33, 10000);
        System.out.println(batman.Power);
        System.out.println(batman.name);
        System.out.println(person.name);

    }
}
