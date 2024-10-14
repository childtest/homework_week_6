package homework;

/* Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
 Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/


import java.util.Scanner;

public class Program_18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Creating a Scanner object

        // Prompting the user for two numbers
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt(); // Reading the first number

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt(); // Reading the second number

        arithmeticOperations(firstNumber,secondNumber);

        scanner.close();

    }

    public static void arithmeticOperations(int firstNumber, int secondNumber) {

        // Performing arithmetic operations
        int sum = firstNumber + secondNumber; // Addition
        int Subtraction = firstNumber - secondNumber; // Subtraction
        int Multiplication = firstNumber * secondNumber; // Multiplication
        int Division = firstNumber / secondNumber; // Division
        int Modulus = firstNumber % secondNumber; // Modulus

        // Displaying the results
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + Subtraction);
        System.out.println(firstNumber + " x " + secondNumber + " = " + Multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + Division);
        System.out.println(firstNumber + " mod " + secondNumber + " = " + Modulus);
    }

}
