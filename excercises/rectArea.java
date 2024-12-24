package com.example.learnjava.excercises;

public class rectArea {
    public static void main(String[] args) {

        System.out.println(rectArea(-10, 10));
    }

    public static int rectArea(int width, int length){
        int area = width * length;
        if (area < 0){
//            area = -area;
            area = Math.abs(area);
            return area;
        }
        return area;
    }

}
