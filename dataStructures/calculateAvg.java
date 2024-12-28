package com.example.learnjava.dataStructures;

public class calculateAvg {

    public static void main(String[] args) {
        calculateAvg gettingavg = new calculateAvg();
        System.out.println("so the avg is: " + String.format("%.2f", gettingavg.getAverage())
                                        + "!!!! :)");
    }

    public double getAverage(){
//        double[] gpas = {4.0, 3.4, 2.5, 1.0, 3.0};
//
//        double gpaSum = 0.0;
//        double avgGpa = 0.0;
//        for (int i = 0; i < gpas.length; i++){
//            gpaSum += gpas[i];
//        }
//        avgGpa = gpaSum / gpas.length;
//
//        return avgGpa;
////        System.out.println("So the average of GPAs is: " + String.format("%.3f", avgGpa));

        double[] gpas = { 4.0, 3.4, 2.5, 1.0, 3.0 };

        double gpaSum = 0.0;
        double avgGpa = 0.0;
        for (int i = 0; i < gpas.length ; i++) {
            gpaSum = gpaSum + gpas[i];
            //calculate the average gpa
            avgGpa = gpaSum / gpas.length;
        }
        return avgGpa;

    }

}

