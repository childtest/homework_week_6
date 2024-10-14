package homework;

/*. Write a Java program to convert a decimal number to binary number.
 Input Data:
      Input a Decimal Number : 5
 Expected Output
   Binary number is: 101*/

import java.util.Scanner;

public class Program_17 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt(); // Reading the decimal number

        convertToBinary(decimalNumber);

        scanner.close();
    }

    public static void convertToBinary(int decimalNumber) {

        // Converting the decimal number to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Displaying the result
        System.out.println("Binary number is: " + binaryNumber);
    }

}
