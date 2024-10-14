package homework;

/*. Write a Java program to convert a given string into lowercase.
      Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
       Output: the quick brown fox jumps over the lazy dog.*/

import java.util.Scanner;

public class Program_19 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Reading the input string

        convertLowercase(inputString);

        scanner.close();
    }

    public static void convertLowercase(String inputString) {

        // Converting the string to lowercase
        String lowercaseString = inputString.toLowerCase();

        // Displaying the result
        System.out.println("Output: " + lowercaseString);
    }
}
