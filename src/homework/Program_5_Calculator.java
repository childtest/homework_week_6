package homework;

/* Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.) */

import java.util.Scanner;

public class Program_5_Calculator {

    // Instance method for addition
    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + result);
    }

    // Instance method for subtraction
    public void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Subtraction of " + num1 + " from " + num2 + " is: " + result);
    }

    // Static method for multiplication
    public static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
    }

    //Static method for division
    public static void divided(int num1, int num2) {

        int result = num1 / num2;
        System.out.println("Division of " + num1 + " by " + num2 + " is : " + result);

    }

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create object to call instance method
        Program_5_Calculator obj = new Program_5_Calculator();

        // Input for addition
        System.out.println("Enter first number for addition: ");
        int addNum1 = scanner.nextInt();
        System.out.println("Enter second number for addition: ");
        int addNum2 = scanner.nextInt();

        // Calling the instance method for addition
        obj.add(addNum1, addNum2);

        // Input for subtraction
        System.out.println("Enter first number for subtraction: ");
        int subNum1 = scanner.nextInt();
        System.out.println("Enter second number for subtraction: ");
        int subNum2 = scanner.nextInt();

        // Calling the instance method for addition
        obj.subtract(subNum1, subNum2);

        // Input for multiplication
        System.out.println("Enter first number for multiplication: ");
        int multiNum1 = scanner.nextInt();
        System.out.println("Enter second number for multiplication: ");
        int multiNum2 = scanner.nextInt();

        // Calling the static method for multiplication
        multiply(multiNum1, multiNum2);

        // Input for division
        System.out.println("Enter first number for division: ");
        int divNum1 = scanner.nextInt();
        System.out.println("Enter second number for division: ");
        int divNum2 = scanner.nextInt();

        // Calling the static method for division
        divided(divNum1, divNum2);

        scanner.close();
    }

}
