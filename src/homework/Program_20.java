package homework;

/*. Write a Java Program to print as below.

 "+------------------------+"
 "|                        |"
 "|      CORNER STORE      |"
 "|                        |"
 "| 2015-03-29  04:38PM    |"
 "|                        |"
 "| Gallons:       10.870  |"
 "| Price/gallon: $ 2.089  |"
 "|                        |"
 "| Fuel total:  $ 22.71   |"
 "|                        |"
 "+------------------------+"*/

import java.util.Scanner;

public class Program_20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Creating a Scanner object

        // Prompting the user for gallons and price per gallon
        System.out.print("Enter gallons: ");
        double gallons = scanner.nextDouble(); // Reading the gallons input

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble(); // Reading the price per gallon input

       cornerStore(gallons, pricePerGallon);

        scanner.close();

    }

    public static void cornerStore(double gallons, double pricePerGallon){

        // Calculating the total fuel cost
        double fuelTotal = gallons * pricePerGallon;

        // Printing the receipt format
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|      CORNER STORE      |");
        System.out.println("|                        |");
        System.out.println("| 2015-03-29  04:38PM    |");
        System.out.println("|                        |");
        System.out.printf("| Gallons:       %.3f  |\n", gallons); // Formatting gallons
        System.out.printf("| Price/gallon: $ %.3f  |\n", pricePerGallon); // Formatting price per gallon
        System.out.println("|                        |");
        System.out.printf("| Fuel total:  $ %.2f   |\n", fuelTotal); // Formatting total fuel cost
        System.out.println("|                        |");
        System.out.println("+------------------------+");
    }
}
