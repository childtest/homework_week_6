package homework;

/*Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r). */

import java.util.Scanner;

public class Program_6 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        CircleAreaCalculator(radius);

        scanner.close(); // Closing the scanner to avoid resource leaks

    }

    public static void CircleAreaCalculator(double radius){

        // Calculate the area of the circle
        double area = Math.PI * radius * radius; // Area formula

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

    }

}
