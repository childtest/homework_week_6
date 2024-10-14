package homework;

/* Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/

import java.util.Scanner;

public class Program_3 {

    //Declare one instance and one static variable.
    int instantVar;
    static int staticVar;

    //Declare one instance method.

    public void displayInstanceMethod(){
        // Call both instance and static variables inside the print statement

        System.out.println("Instance Method");
        System.out.println("Instance Variable: "+ instantVar);
        System.out.println("Static Variable "+ staticVar);

    }

    // Declare one static method

    public static void displayStaticMethod(){
        // Call both instance and static variables inside the print statement

        Program_3 obj = new Program_3();
        System.out.println("Static Method");
        System.out.println("Instance Variable: "+ obj.instantVar);
        System.out.println("Static Variable "+ staticVar);

    }

    // Declare main method

    public static void main(String[] args) {

        // Creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Creating an object to call the instance method
        Program_3 obj = new Program_3();

        // Input values for instance and static variables
        System.out.println("Enter the value for Instance variable: ");
        obj.instantVar = scanner.nextInt();

        System.out.println("Enter the value for Static variable: ");
        staticVar = scanner.nextInt();

        //Call both instance and static methods

        obj.displayInstanceMethod();
        displayStaticMethod();


        scanner.close();

    }

}
