package homework;

/*. Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
  Width = 5.5 Height = 8.5
    Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20*/

import java.util.Scanner;

public class Program_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble(); // Reading the width

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble(); // Reading the height

        rectangle(width, height);

        scanner.close();

    }

    public static void rectangle(double width, double height) {
        // Calculating the area and perimeter
        double area = width * height; // Area = width * height
        double perimeter = 2 * (width + height); // Perimeter = 2 * (width + height)

        // Displaying the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
