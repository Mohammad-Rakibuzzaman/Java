package com.example.learnjava.oop;

public class Rectangle {
    private int length;
    private int width;

    //getter and setter alt + ins

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //overloading constructor
    public Rectangle(){} //if we dont want to use this overloading then we have to set the box manually. go check and commentout this
    //creating contractor

    public Rectangle(int lengths, int widths) {
        this.length = lengths;
        this.width = widths;
    }




    public int area() {
//        int areaOfRect = this.Length * this.width;
        if( (this.length < 0) || (this.width < 0) ) {
            return 0;
        }
        return this.length * this.width;
    }

    public String showDescription(){
        return "The length is: " + this.length + " and width is: " + this.width
                + ". Finally total area of rectangle is: " + this.area();
    }


}
