package com.example.learnjava.javaInheritance;

public class mainClass {
    public static void main(String[] args) {

////        Person ratulInfo = new Person("Md.", "rakib", 27);
//        Person rafaInfo = new Person("Avoid", "Rafa", 30);
//        System.out.println(rafaInfo.getAge());
////        ratulInfo.setFirstName("OrangeCoder");
////        System.out.println(ratulInfo.getFirstName());

            Employee employee = new Employee();
            employee.setFirstName("Mohammad");
            employee.setLastName("Rakibuzzaman");
            employee.setAge(27);
            employee.setId(10042);
            employee.setAnnualSalary(100000);

            System.out.println(employee.getAge());
            System.out.println(employee.getFirstName());
            System.out.println(employee.getId());
            System.out.println(employee.getAnnualSalary());


            Manager manager = new Manager();
            manager.setFirstName("George");
            manager.setLastName("Killos");
            manager.setAge(59);
            manager.setId(10021);
            manager.setAnnualSalary(45000);

            //so overriding super class methods technique increasing salary of Killos
            System.out.println(manager.getAnnualSalary() + "|| " + manager.getAge() + "|| " + manager.getId()
                                                                        + "- " + manager.getLastName());

            manager.setExperience(6);
            System.out.println("our manager have " + manager.getExperience() + " years of experience in tech field.");
            manager.manageOffice();

    }


}
