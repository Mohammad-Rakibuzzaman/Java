package com.example.learnjava.dataStructures.javaobjectasamethodparameters;

public class Javaobjectasamethodparameters {

    public static void main(String[] args) {

        Employer grameenbank = new Employer();

        Employee Jenna = new Employee("Jenna", "K.",
                    214124, "HR", "Recruiter", 4500.89);

        Employee Lance = new Employee("Lance", "K.",
                52151, "IT", "IT/Support Enginere", 3522.12);


        grameenbank.calculateAnualBonus(Jenna);
        grameenbank.calculateAnualBonus(Lance);

        System.out.println(grameenbank.areRelated(Jenna, Lance));

        grameenbank.employeeDetails(Jenna);


    }

}
