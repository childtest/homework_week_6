package homework;

/* Write a Java program to swap two variables.*/


import java.util.Scanner;

public class Program_15 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first variable (a): ");
        int a = scanner.nextInt(); // Reading the first variable

        System.out.print("Enter the second variable (b): ");
        int b = scanner.nextInt(); // Reading the second variable

        swappingVariable(a, b);

        scanner.close();
    }

    public static void swappingVariable(int a, int b) {
        // Displaying the values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping the variables using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Displaying the values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}
