package homework;

/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C). */

import java.util.Scanner;

public class Program_7 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        // Reading the temperature in Fahrenheit
        double fahrenheit = scanner.nextDouble();

       temperatureConverter(fahrenheit);

        scanner.close();

    }

    public static void temperatureConverter(double fahrenheit){

        // Convert Fahrenheit to Celsius using the formula (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The temperature in Celsius is: " + celsius);
    }
}
