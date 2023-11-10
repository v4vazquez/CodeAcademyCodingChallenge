package org.example;

//4. Calculate the sum of numbers within an array
//        You can create your own array of numbers but consider trying this problem with a few different sets to verify your solution.
//        Have one array with negative and positive numbers and another with integers and decimals.
//        You could also try using arrays of different lengths. If you’re feeling comfortable with this, try the slightly more challenging bonus challenge below.
//        Bonus intermediate challenge: Create a function that can return the sum of a particular column or row number in a table.

public class SumOfArrayNumbers {

    public int sumOfArray() {

        int [] numbers = {-1,2,-3,4,5};

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total +=numbers[i];
        }
        System.out.println(total);
        return total;
    }

}
