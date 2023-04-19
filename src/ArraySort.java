import java.util.Arrays;
import java.util.Scanner;

// Writing a program to sort the user defined array in ascending order
public class ArraySort
{
    // Creating object for scanner class to take input
    Scanner scanner=new Scanner(System.in);


    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        ArraySort arraySort=new ArraySort();

        // calling method using class object
        arraySort.sortInAscending();
    }


    void sortInAscending()
    {
        // message to user for what to enter
        System.out.println("Enter the number of size of array");

        // storing variable using scanner object
        int arraysize=scanner.nextInt();

        // declaration & instantiation of array
        int[] a = new int[arraysize];


        // message to user for what to enter
        System.out.println("Enter the elements for array");

        // using for loop and scanner object to take user input elements according to the user input array size
            for (int i = 0; i < arraysize; i++)
            {
                a[i] = scanner.nextInt();
            }
        // using the inbuilt array method to sort the elements of the array
        Arrays.sort(a);

        // message to print with the output
        System.out.println("Ascending order: ");

        // using for loop to print the updated array sorted in ascending order
        for (int i = 0; i <arraysize ; i++)
        {
            System.out.println(a[i]);
        }

    }
}
