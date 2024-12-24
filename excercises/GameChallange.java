package com.example.learnjava.excercises;

public class GameChallange {
    public static void main(String[] args) {

        System.out.println(runnerMachine(3));

    }

    public static String runnerMachine(Integer number){

//        if (number == 0){
//            return "CodeRunner running North.";
//        } else if (number == 1) {
//            return "CodeRunner running South.";
//        } else if (number == 2) {
//            return "CodeRunner running West.";
//        } else if (number == 3) {
//            return "CodeRunner is running East.";
//        } else if ((number  >= 4) || (number < 0)) {
//            return "CodeRunner is confused - doesn't know where to go!";
//        } else {
//            return "Unknown command.";
//        }

        // Using Switch

        switch (number){
            case 0:
                return "CodeRunner running North.";
            case 1:
                return "CodeRunner running South.";
            case 2:
                return "CodeRunner running West.";
            case 3:
                return "CodeRunner is running East.";

            default:
                if ((number >= 4) || (number < 0)) {
                    return "CodeRunner is confused - doesn't know where to go!";
                }
                return "Unknown command.";
        }



    }

}
