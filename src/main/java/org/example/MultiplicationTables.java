package org.example;


import java.util.ArrayList;
import java.util.Scanner;

//2.      Print a table containing multiplication tables
//        Let’s start with the tables that many of us had to memorize in school.
//        Can you print a table that contains all the answers to the multiplication tables from 1 through 10?
//        Like Challenge #1, can you create an efficient solution that you could easily expand should you need the 12 times table?
public class MultiplicationTables {
    public ArrayList getMultiplicationTables() {

        System.out.println("For this option select a number that you want to see them multiplications of(for example multiplication table from 1-10");
        System.out.println("Enter your first number");
        Scanner scan = new Scanner(System.in);
        int userNumber = Integer.parseInt(scan.nextLine());

        ArrayList multiplicationNumbers = new ArrayList<>();
        for (int i = 1; i <= userNumber; i++) {
            int product = userNumber * i;
            multiplicationNumbers.add(i + " x " + userNumber + " = " + product );

        }

        System.out.println(multiplicationNumbers);
        return multiplicationNumbers;

    }
}
