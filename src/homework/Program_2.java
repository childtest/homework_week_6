package homework;

/*2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.*/

import java.util.Scanner;

public class Program_2 {
    //Declare two static variables

    static int num1;
    static int num2;

    //Declare one static method

    public static void display() {
        //Call both static variables into the static method inside the print statement.

        System.out.println("You entered number 1 is " + num1);
        System.out.println("You entered number 2 is " + num2);
    }

    //Declare the Main method.
    public static void main(String[] args) {
// Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input values for num1 and num2
        System.out.println("Please enter no 1 : ");
        num1 = scanner.nextInt();  // Taking input for num1

        System.out.println("Please enter no 2 : ");
        num2 = scanner.nextInt();

        //Call the static method into the Main method

        display();
        scanner.close();

    }

}
