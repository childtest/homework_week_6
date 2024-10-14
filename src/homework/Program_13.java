package homework;

import java.util.Scanner;

/*Write a Java program that takes three numbers as input to calculate and
print the average of the numbers. */

public class Program_13 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Reading the first number

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Reading the second number

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble(); // Reading the third number

        avrage(num1, num2, num3);

        scanner.close();

    }

    public static void avrage(double num1, double num2, double num3) {
        // Calculate the average
        double average = (num1 + num2 + num3) / 3;

        // Display the result
        System.out.println("The average of the numbers is: " + average);
    }
}
