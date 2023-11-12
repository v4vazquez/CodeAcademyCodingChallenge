package org.example;

import java.util.Scanner;

//Here, you’ll create a function that’ll give you a “true” or “false” Boolean as its output.
//        The inputted number should only return a “true” if it’s divisible by 10.
//        Otherwise, your program should return a “false” answer.
public class DivisibleBy10 {

    public boolean divisibleBy10(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to see if its divisible by 10");
        int userNumber = Integer.parseInt(scan.nextLine());

        if(userNumber%10==0){
            System.out.println("Yep, its divisible by 10!");
            return true;
        }
        else
            System.out.println("Yeah... hate to break it to you... its not divisible by 10...");
        return false;
    }

}
