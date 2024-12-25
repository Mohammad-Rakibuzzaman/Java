package com.example.learnjava.oop;

public class Rectangle {
    int length;
    int width;

    //creating contractor


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
//        int areaOfRect = this.Length * this.width;
        if( (this.length < 0) || (this.width < 0) ) {
            return 0;
        }
        return this.length * this.width;
    }


}
