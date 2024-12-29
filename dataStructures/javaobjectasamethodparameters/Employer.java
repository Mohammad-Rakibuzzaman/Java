package com.example.learnjava.dataStructures.javaobjectasamethodparameters;

public class Employer {

    private String name;
    private String location;

    public Employer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Employer() {
    }


    public boolean areRelated(Employee employeeA, Employee employeeB) {
        if (employeeA.getLastName() == employeeB.getLastName()) {
            return true;
        } else
            return false; // when we have 1 line statement we dont need to add curly braces
    }

    public void calculateAnualBonus(Employee employee) {
        double annualBonus = (employee.getMonthlySalary() * 0.15) * 11;
        System.out.println("Annual bonus for " + employee.getFirstName() + " is " + annualBonus);

    }




    //we can pass objects inside of below methods
    public void employeeDetails(Employee employee) {
        //we could do create our own Employee object but to make it more good we can pass it to parameter
//        Employee employee = new Employee(); // problem is we are assigning Employee inside of Employer given methods
//        Employee employee = new Employee();
        System.out.println(
                "ID: " + employee.getIdNumber()
                + "|| Name: " + employee.getFirstName() + " " + employee.getLastName()
                + " || Department: " + employee.getDepartment() + " || "
                + " Position: " + employee.getPosition()
                + " || Monthly salary: " + employee.getMonthlySalary() + "$"
        );


    }





}
