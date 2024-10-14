package homework;

import java.util.Scanner;

  // Write a program to calculate the area of a triangle.


public class Program_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        // Reading the base value
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        // Reading the height value
        double height = scanner.nextDouble();

        calculateTriangle(base,height);

        scanner.close();
    }

    public static void calculateTriangle(double base, double height) {

        // Calculate the area of the triangle
        double area = 0.5 * base * height; // Area formula: (1/2) * base * height

        // Display the result
        System.out.println("The area of the triangle is: " + area);
    }

}
