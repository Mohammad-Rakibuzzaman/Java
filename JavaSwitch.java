package com.example.learnjava;

public class JavaSwitch {
    public static void main(String[] args) {

        //better way to deal such condition where might have more than 2 possible conditions
        //use switch statement
        int command = 3;

        switch (command) {
            case 0:
                System.out.println("CodeRunner running North");
                break;
            case 1:
                System.out.println("CodeRunner running South");
                break;
            case 2:
                System.out.println("CodeRunner running West");
            case 3:
                System.out.println("CodeRunner running East");
            default:
                System.out.println("CodeRunner is confused !");

        }



//        if (command == 0){
//            System.out.println("CodeRunner running North");
//        } else if (command == 1) {
//            System.out.println("CodeRunner running South");
//        } else if (command == 2) {
//            System.out.println("CodeRunner running West");
//        } else if (command == 3) {
//            System.out.println("CodeRunner running East");
//        } else {
//            System.out.println("CodeRunner is confused !");
//        }

    }
}
