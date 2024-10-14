package homework;

/*Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme. */

import java.util.Scanner;

public class Program_4 {

    //Declare two instance and two static variables
    int instanceVar1;  // First instance variable
    String instanceVar2; //Second instance variable

    static int staticVar1; // First static variable
    static String staticVar2;

    //Declare one instance method

    public void displayInstanceMethod(){

        System.out.println("Instance Method:");
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

    }

    //Declare one static method
    public static void displayStaticMethod(){

        // We need to create an object to access the instance variables
        Program_4 obj = new Program_4();

        System.out.println("Static Method:");
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

    }

    //Declare the Main method.

    public static void main(String[] args) {
        // Declare the Scanner Object
        Scanner scanner =new Scanner(System.in);

        Program_4 obj = new Program_4();

        System.out.println("Enter the value for Instance variable 1 : ");
        obj.instanceVar1 = scanner.nextInt();
        System.out.println("Enter the value for Instance variable 2 : ");
        obj.instanceVar2 = scanner.nextLine();
        System.out.println("Enter the value for Static variable 1 : ");
        staticVar1 = scanner.nextInt();
        System.out.println("Enter the value for Static variable 2 : ");
        staticVar2 = scanner.nextLine();

        obj.displayInstanceMethod();
        displayStaticMethod();

        scanner.close();
    }

}
