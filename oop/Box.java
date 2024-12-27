package com.example.learnjava.oop;

public class Box extends Rectangle{
    private int height;

    //this section if we dont overloading out rectangle constructor
    //but for this we must have to put arguments inside of our creating new instances or objects
//    public Box(int length, int width, int height){
//        super(length, width);
//        this.height = height;
//    }


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
