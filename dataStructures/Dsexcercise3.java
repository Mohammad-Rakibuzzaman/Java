package com.example.learnjava.dataStructures;

public class Dsexcercise3 {
    /*
    And here we have the best practics to make a method and work statically
    means when we creaete other method using static it will appear automatically inside of our main method.

    But if we just creatd public void coundDown() {} like this we needed to create a new object or instances
    such as we need to declare-

    Dsexcercise3 arr = new Dsexcercise3()
    then when we call--  arr.  -- > we will have a lots of method we created manually lik countDown
    so we need to call now:
    arr.countDown()
    now it will print our

     */



    public static void main(String[] args) {

//        for (int i = 10; i >= 1; i--){
//            System.out.print(i + " ");
//        }
        Dsexcercise3 arr = new Dsexcercise3();
        arr.countDown();


    }

    public void countDown() {

        //TODO: write the countdown for-loop
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

}
