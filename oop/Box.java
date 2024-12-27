package com.example.learnjava.oop;

public class Box extends Rectangle{
    private int height;

    //this section if we dont overloading out rectangle constructor
    //but for this we must have to put arguments inside of our creating new instances or objects
//    public Box(int length, int width, int height){
//        super(length, width);
//        this.height = height;
//    }

    public Box(int lengths, int widths, int height) {
        super(lengths, widths);
        this.height = height;
    }


//    public Box(int height) {
//        this.height = height;
//    }



    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public int area() {
        return 2 * (super.area() + getLength() * this.height + getWidth() * this.height);
    }

    public void showResult() {
        Box box = new Box(13, 20, 10);
        System.out.println("Box area: " + area());
    }


//    public static void main(String[] args) {
//        Box box = new Box(13, 20, 10);
//        box.showResult();
//    }



}
