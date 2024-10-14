package homework;

import java.util.Scanner;

// Write a program to convert the upper case to lower case.

public class Program_9 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an uppercase string
        System.out.print("Enter a string in uppercase: ");
        // Reading the string input
        String uppercaseString = scanner.nextLine();

        convertString(uppercaseString);

        scanner.close(); // Closing the scanner to avoid resource leaks

    }

    public static void convertString(String uppercaseString) {

        // Convert the string to lowercase
        String lowercaseString = uppercaseString.toLowerCase(); // Using the toLowerCase() method

        // Display the converted string
        System.out.println("The string in lowercase is: " + lowercaseString);
    }
}
