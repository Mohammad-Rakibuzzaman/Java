package com.example.learnjava.dataStructures;


public class JavaArrayAsMethodParameters {
    public static void main(String[] args) {

//        int[] numbers = {12, 0, 34, 100, 34, 2, 3, 5, 10, 78, 69, 12349};
        int[] numbers = {};
        findMultThree(numbers);

    }

    public static void findMultThree(int[] nums) {

        if (nums.length > 0) {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] % 3 == 0) {
                    System.out.println(nums[i] + " is multiply by 3.");
                    System.out.println(nums[i] + " is multiply by 3.");
                } else {
                    System.out.println("No");
                }

            }
        } else {
            System.out.println("Array is Empty! :( ");
        }



    }


}
