package com.example.learnjava.excercises;

public class AtmExcercise1 {
    public static void main(String[] args) {
        String command = "Deposit";
        int balance = 1000;
        int amount = 100;


        switch (command) {
            case "Withdraw":
                balance -= amount;
                break;
            case "Deposit":
                balance += amount;
                break;
            default:
                System.out.println("Not valid input!");

        }
        System.out.println("Your balance used to be 1000, and now is "+balance);
        System.out.println("Most welcome for using our bank :))");


//        if (command == "Withdraw") {
//            balance = balance - amount;
//            System.out.println("Your balance used to be 1000, and now is "+balance);
//        } else {
//            balance = balance + amount;
//            System.out.println("Your balance used to be 1000, and now is "+balance);
//
//        }

    }
}
