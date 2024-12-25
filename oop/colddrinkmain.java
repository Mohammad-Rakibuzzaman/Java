package com.example.learnjava.oop;

public class colddrinkmain {
    public static void main(String[] args) {
        Colddrinkcompany coconutwater = new Colddrinkcompany();
        coconutwater.name = "CocoWater";
        coconutwater.drinktype = "White-Coconut";
        coconutwater.releaseyear = 2024;
        System.out.println(coconutwater);
        System.out.println(coconutwater.drinktype);
        System.out.println(coconutwater.releaseyear);
        System.out.println(coconutwater.name);

        Colddrinkcompany drinko = new Colddrinkcompany();
        drinko.name = "Driiinko";
        drinko.drinktype = "White-Lemon";
        drinko.releaseyear = 2023;
        System.out.println(drinko);
        System.out.println(drinko.releaseyear);
        System.out.println(drinko.name);
        System.out.println(drinko.drinktype);


    }


}
