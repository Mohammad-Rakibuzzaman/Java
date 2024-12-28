package com.example.learnjava.javaInheritance;

public class Employee extends Person {

    private int id;
    private double annualSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //creating object the ultimate class in java where all classes are inherite
    //just type to and appear below with super thats mean toString which override....

//    @Override
//    public String toString() {
//        return this.getFirstName() + ", "
//                + this.getId() + ", "
//                + this.getAnnualSalary();
//
//    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
