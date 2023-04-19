import java.util.Scanner;

// Writing a program using scanner class to list the numbers divisible by 3 & 5 separately from the user input range.
public class DivisibleNumbers2
{
    // Creating object for Scanner class to take input
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        DivisibleNumbers2 divisibleNumbers2 = new DivisibleNumbers2();

        //calling the method using class object
        divisibleNumbers2.divide();

    }


    // No return type no parameters
    public void divide()
    {
        // message to user for what to enter
        System.out.println("\nEnter 2 integer numbers in between 1-100 to see the full list of numbers divisible by number 3 & 5 within your provided range. Press enter after each input.");

        //Storing variables using scanner object
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();



        if (number1 >= 1 && number2 <= 100)
        {
            // Writing the message to be displayed to user with output
            System.out.println("\nHere is the list of numbers from your range " + number1 + "-" + number2 + " which are divisible by number 3");

            // using while loop to get the list of numbers from the range input by the user

            int i = number1;
            while (i <= number2)
            {
                if (i % 3 == 0)                         // Writing a condition using modulus operator to print the numbers that are divisible by 3
                {
                    System.out.print(i + ", ");         // Writing print command for required output
                } i++;
            }
        }else
        {
            System.out.println("Invalid input. Please enter a range from 1-100");
        }



        if (number1 >= 1 && number2 <= 100)
        {
            // Writing the message to be displayed to user with output
            System.out.println();
            System.out.println("\nHere is the list of numbers from your range "+ number1 + "-" + number2 + " which are divisible by number 5");

            // using while loop to get the list of numbers from the range input by the user
            int i = number1;
            while (i<= number2)
            {
                if (i % 5 == 0)                         // Writing a condition using modulus operator to print the numbers that are divisible by 5
                {
                System.out.print(i + ", ");              // Writing print command for required output
                } i++;
            }
        }
    }
}
