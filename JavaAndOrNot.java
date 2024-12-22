package com.example.learnjava;

public class JavaAndOrNot {
    public static void main(String[] args) {

         /*
                = --> assignment
                ! -->> negate or opposite

            -----Relational Operators-----
                == --> comparison
                != --> Not equal (relational operator if equal (=) included)
                < --> Less than
                > --> Greater than
                <= ---> Less than or equal to
                >= --> Greater than or equal to

            -----Logical Operator------


                && -->> And operator = > every both operand should be true.
                || -- >> Or operator
                ! -->> negate or opposite.
                also called unary operator : returns the reverse value of the logical expression.
                Unary because it only has one operand AND and OR are binary becuase they have
                two operands.

         */

        //and
        int age = 18;
        boolean isCitizen = true;
        boolean notAFelon = false;

        if ( (age >= 18) && (isCitizen) && (notAFelon) ) {
            System.out.println("Can Vote.");
        } else {
            System.out.println("Can't.... ");
        }

        //Or
        int a = 12;
        int b = 11;
        boolean isSnowing = false;

        if ( (a > b) || (isSnowing == false) && (a < 78) ) {
            System.out.println("Both of statements are true or atleast 1 is true!");
        } else {
            System.out.println("False info...");
        }

        //not

        boolean isFunny = true;

        if (!isFunny) {
            System.out.println("Not Funny");
        } else {
            System.out.println("Funny");
        }

        if( (age > 10) || (isFunny==false) && (age < 89)  ) {
            System.out.println("True");
        } else {
            System.out.println("Not true");
        }






    }


}
