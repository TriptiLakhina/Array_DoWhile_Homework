import java.util.Scanner;

// Writing a program using scanner class to check if the user input number is an armstrong number or not
public class ArmstrongNumber2
{

    // Creating object for scanner class to take input
    Scanner scanner = new Scanner(System.in);



    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        ArmstrongNumber2 armstrongNumber2=new ArmstrongNumber2();

        // Calling the method using class object
        armstrongNumber2.checkIfArmstrongNumber();

    }



    // No return type no parameters
    public void checkIfArmstrongNumber()
    {
        // message to user for what to enter
        System.out.println("Enter a number:");

        // Storing variables using scanner object
        int number = scanner.nextInt();

        // Storing & initializing the variables
        int count = 0, a, remainder, b, sum = 0;
        a = number;
        b = number;

        // using while loop to take a count of number of digits in the number
        while (a > 0)
        {
            a = a / 10;
            count++;
        }

        // using while loop get the sum of the cubes of all the digits in the number
        while (number > 0)
        {
            remainder = number % 10;
            sum = (int) (sum + Math.pow(remainder, count));
            number = number / 10;
        }

        // using if else to check if the sum is same as the number or not and accordingly print if the number is Armstrong or not.
        if (sum == b) {
            System.out.println(b + " is an Armstrong number");
        } else {
            System.out.println(b + " is not an Armstrong number");
        }
    }
}
