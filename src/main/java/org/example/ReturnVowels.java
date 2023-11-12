package org.example;

import java.util.Scanner;

//Create a function that’ll return an integer of the number of vowels found in a string.
//        This is a great way to practice determining the features of a dataset.
//        If you use JavaScript later in your career, you’ll be well-prepared to determine what datasets (or just strings) consist of.
//        If you feel like an extra challenge, consider returning the number of characters.
public class ReturnVowels {

    public int vowelCounter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This will check how many vowels are input by what you put in");
        String testString = scanner.nextLine();
        String newString = testString.toLowerCase();
        int count =0;
        for (int i = 0; i < testString.length(); i++) {
            if(newString.charAt(i)=='a' ||newString.charAt(i)=='e'||newString.charAt(i)=='i'||newString.charAt(i)=='o'
            || newString.charAt(i)=='u')
            count++;
            }

        System.out.println(count);
        return count;
    }

}
