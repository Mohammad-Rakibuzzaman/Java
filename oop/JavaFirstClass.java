package com.example.learnjava.oop;

public class JavaFirstClass {
    public static void main(String[] args) {
        //everything classes like String comes from java object
        String name = "Lucy";
//        name.
//here we can find getclass which method is from object package

        //lets explore another one string builder

        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Hey my name is " + name);
        stringbuilder.append(", And I'm 27 years old!!!");

        System.out.println(Math.abs(-8));
        System.out.println(Math.PI);
        System.out.println(stringbuilder);


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
//        sonyerecson.color = "Red nash";

//        System.out.println(sonyerecson.color);
        panasonic.setName("Orangapple");
        panasonic.setColor("Orange Light");
        panasonic.setModel(422212);

        //after setting getter and setter
//        panasonic.setColor("Green");
        System.out.println("New mic: " + panasonic.getColor());
        System.out.println("New mic: " + panasonic.getName());
        System.out.println("New mic: " + panasonic.getModel());

        System.out.println(panasonic.showDescription());


        System.out.println(panasonic);
        System.out.println(sonyerecson);


        Rectangle sayedabadDhk = new Rectangle(11, 2);

        System.out.println(sayedabadDhk.getWidth());
        System.out.println(sayedabadDhk.getLength());

        System.out.println(sayedabadDhk.showDescription());

//        System.out.println(sayedabadDhk.width);
//        System.out.println(sayedabadDhk.length);


        System.out.println("--------------Starting overloading constructors---------------");
        //overloading constructors

        Microphone newMic = new Microphone("NewMic", "Green", 12412512);
        //this is new create for implicit constructor invoking our new empty constructor
        Microphone otherMic = new Microphone();

        otherMic.setColor("Transparent Blue");
        System.out.println(otherMic.getColor());

        Microphone aforTech = new Microphone("A4techMini", 1251251);


    }

}
