import java.util.Scanner;
// Writing a program to get multiplication table by Do While using scanner class
public class MultiplicationDoWhileScanner
{
    // Creating object for scanner class to take user input
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        MultiplicationDoWhileScanner multiplicationDoWhileScanner=new MultiplicationDoWhileScanner();

        // calling method using class object
        multiplicationDoWhileScanner.getTable();
    }



    // No return no parameters
    public void getTable()
    {
        // message to user for what to enter
        System.out.println("\nEnter table size (Enter 3 to get 3 x 3 table)");

        // storing variable using scanner object
        int tablesize=scanner.nextInt();
        int factor1=1;

        System.out.println("Multiplication table: ");

        do
        {
            int factor2=1;

            do
            {
                int result = factor1 * factor2;
                System.out.print(result + "   ");
                factor2++;
            }while (factor2<=tablesize);

            System.out.println();
            factor1++;
        }while (factor1<=tablesize);
    }
}
