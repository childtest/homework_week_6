package homework;

/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme. */

import java.util.Scanner;

public class Program_1 {

    // Declare two instance variables
    int num1;
    int num2;

    //Declare one instance method
    public void displayNumbers() {
        // Call both instance variables into the instance method inside the print statement
        System.out.println("Number 1 is: " + num1);
        System.out.println("Number 2 is" + num2);
    }

    // Declare the Main method
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Creating an object of the class
        Program_1 obj = new Program_1();

        // Asking user to enter values for num1 and num2
        System.out.print("Enter Number 1: ");
        obj.num1 = scanner.nextInt(); // Taking input for num1

        System.out.print("Enter Number 2: ");
        obj.num2 = scanner.nextInt(); // Taking input for num2

        // Calling the instance method to print the numbers
        obj.displayNumbers();

        scanner.close();
    }
}
