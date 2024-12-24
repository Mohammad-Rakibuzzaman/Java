package com.example.learnjava;

public class JavaReturnTypeDoublereturntype {
    public static void main(String[] args) {
        myName("Paulo");
        int finalResult = addNums(10, 5) + 10;
        System.out.println(finalResult);

        String originalName = fullName("Md.", "Rakibuzzaman");
        System.out.println(originalName);
        System.out.println(charRet('S'));
        System.out.println("The correct answer is: "+booleanType(true));

        //we can limit decimal value 2 ways
        //String.format
        Double value = aDoubleType(23.5125151);
        System.out.println("So exact value is: " + String.format("%.3f", aDoubleType(12.6114214)));
        System.out.println("So exact after point till 2 decimal value is: " + String.format("%.2f", value));

        System.out.println("The total kgs oil is litre: " + String.format("%.4f", aFloatType(29.22142142154f)));

    }


    public static void myName(String mName){
        System.out.println(mName);
    }


    //Returning Integer
    public static int addNums(int a, int b){
        int result;
//        int result = 0;
        result = a + b;
//        System.out.println("Sum is: " + (a+b));
        return result; //same as  (a+b)
    }

    //Return a String

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }


    //Return Char
    public static Character charRet(Character letterofYourname) {
        return letterofYourname;
    }

    public static Boolean booleanType(Boolean isFalseorTrue) {
        return isFalseorTrue;
    }

    public static Double aDoubleType(Double doublevalue) {
        return doublevalue;
    }
    public static Float aFloatType(Float floatvalue) {
        return floatvalue;
    }








}
