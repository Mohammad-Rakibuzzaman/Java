package com.example.learnjava.oop;

public class JavaFirstClass {
    public static void main(String[] args) {

//        Microphone microphone = new Microphone(); //instantiating our obj. so instantiate is creating an object from its actual class or Blueprint
//        microphone.color = "Black";
//        microphone.name = "Dark gravy";
//        microphone.model = 142;
//
//        Microphone panasonic = new Microphone();
//        panasonic.color = "Yellow";
//        panasonic.name = "Panasonic Ult";
//        panasonic.model = 33;
//
//        System.out.println(microphone.name);
//        System.out.println(microphone);
//
//
//        System.out.println(panasonic.name);
//        System.out.println(panasonic);
//
//        Rectangle areaMirpurS = new Rectangle();
//        areaMirpurS.Length = 20;
//        areaMirpurS.width = 10;
//
//        System.out.println(areaMirpurS.Length);
//        System.out.println(areaMirpurS.width);
//        System.out.println(areaMirpurS);

    //after creating contructor we have to give all the parameters ;) means those properties

        Microphone panasonic = new Microphone("PanaCam", "Aqua", 12412512);
        Microphone sonyerecson = new Microphone("Sonyexpresso", "Yellow Oral", 2515112);

        System.out.println(panasonic);
        System.out.println(sonyerecson);


        Rectangle sayedabadDhk = new Rectangle(11, 2);
        System.out.println(sayedabadDhk.width);
        System.out.println(sayedabadDhk.length);






    }

}
