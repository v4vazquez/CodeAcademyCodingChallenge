package org.example;

import java.util.Scanner;

//Yet another way to clean up data is to remove any errors or unnecessary spaces.
//        This function will take in a string and then return it with all spaces removed.
//        Think about if you were tasked with cleaning up customer data at your job.
//        You could scale this function to clean up specific fields of data, such as zip codes.
public class SpaceRemoval {

    public String spaceRemover(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence that you want all the spaces removed from");
        String testString = scanner.nextLine();
        String noSpacesString ="";
        //can do this with a number of ways. replaceAll(), replace(), using a loop
        for (int i = 0; i < testString.length(); i++) {
            char noSpace = testString.charAt(i);
            if(!Character.isWhitespace(noSpace)){
                noSpacesString=noSpacesString+noSpace;
            }
        }
        return noSpacesString;
    }

}
