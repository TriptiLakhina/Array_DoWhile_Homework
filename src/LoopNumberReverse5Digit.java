import java.util.Scanner;

// Writing a program using scanner class to reverse the user input number
public class LoopNumberReverse5Digit {
    // Creating object for scanner class to take input
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Creating class object to call non-static method to static area
        LoopNumberReverse5Digit loopNumberReverse5Digit = new LoopNumberReverse5Digit();

        // calling the method using class object
        loopNumberReverse5Digit.reverseTheNumber();

    }


    // No return type no parameters
    public void reverseTheNumber() {
        // message to user for what to enter
        System.out.println("Please enter a 5 digit number to reverse");

        //Storing variable using scanner object
        int number = scanner.nextInt();

        // Storing and Initializing the variable
        int reverse = 0;


        // using forloop to reverse the number - without mentioning the initialization & increment part of the forloop as it is not being used



        if (number<99999 && number>9999) {
            System.out.print("The reverse of the given number " + number + " is: ");
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }


            // Writing print command for required output
            System.out.println(reverse);

        } else {
            System.out.println("Invalid input. Please enter 5 digits");
        }
    }
}