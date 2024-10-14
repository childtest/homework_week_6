package homework;

/*. Write a Java program to add two binary numbers.
 Input Data:
  Input first binary number: 10
  Input second binary number: 11

 Expected Output:

  Sum of two binary numbers: 101 */

import java.util.Scanner;

public class Program_16 {

    public static void main(String[] args) {

        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine(); // Reading the first binary number

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine(); // Reading the second binary number

        convertBinary(binary1,binary2);

        scanner.close();
    }

    public static void convertBinary(String binary1, String binary2) {

        // Converting binary strings to decimal integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Adding the two decimal numbers
        int sum = num1 + num2;

        // Converting the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Displaying the result
        System.out.println("Sum of two binary numbers: " + binarySum);
    }


}
