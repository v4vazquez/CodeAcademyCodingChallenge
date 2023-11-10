package org.example;

//
//1. Print all even numbers from 0 – 10
//        Try to make the solution to this problem as efficiently as possible.
//        Consider using loops that would allow you to type the fewest characters/commands.
//        While you could simply print the even numbers, get creative and see how you could output them in a way that
//        would work up to 10 or even up to 10,000 with little extra effort.

import java.util.ArrayList;
import java.util.Scanner;

    public class EvenNumbers {
        public ArrayList getEvenNumbers() {

            System.out.println("For this option select two positive numbers, to print out to see the even numbers between them");
            System.out.println("Enter your first number");
            Scanner scan = new Scanner(System.in);
            int firstUserNumber = Integer.parseInt(scan.nextLine());
            System.out.println("Enter your second number");
            int secondUserNumber = Integer.parseInt(scan.nextLine());
            ArrayList evenNumbers = new ArrayList<>();
            for (int i = firstUserNumber; i <= secondUserNumber; i++) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
            }

            System.out.println(evenNumbers);
           return evenNumbers;

        }
}
