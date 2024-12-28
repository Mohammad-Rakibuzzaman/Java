package com.example.learnjava.javaInheritance;

public class Manager extends Employee{

    private int experience;


    //overriding super class methods here such as superclass employee
    //overriding salary
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 100000;
    }

    @Override
    public int getId() {
        return super.getId() + 100;
    }



    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void manageOffice(){
        System.out.println("Mr." + this.getFirstName() + " is calling everyone for the meeting!");
    }


//    @Override
//    public String toString() {
//        return this.getLastName() + " ,"
//                + this.getExperience() + " , and finally salary of annual is: "
//                + this.getAnnualSalary();
//    }
}
