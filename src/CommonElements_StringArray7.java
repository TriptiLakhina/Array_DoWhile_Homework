import java.util.Arrays;
import java.util.Scanner;

// Writing a program to find the common elements between two user defined string arrays
public class CommonElements_StringArray7
{

    // Creating object for scanner class to take input
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        CommonElements_StringArray7 commonElements_stringArray7 = new CommonElements_StringArray7();

        // calling method using class object
        commonElements_stringArray7.findCommonElements();

    }


    public void findCommonElements()
    {
        // message to user for what to enter
        System.out.println("Enter the size of 1st array");

        // storing variable using scanner object
        int arraysize1 = scanner.nextInt();

        // declaration & instantiation of array
        String[] array1 = new String[arraysize1];

        // message to user for what to enter
        System.out.println("Enter the elements for 1st array");

        // using for loop and scanner object to take user input elements according to the user input array size
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = scanner.nextLine();
        }


        // message to user for what to enter
        System.out.println("Enter the size of 2nd array");

        // Storing variable using scanner object
        int arraysize2 = scanner.nextInt();

        // declaration & instantiation of array 2
        String[] array2 = new String[arraysize2];

        // message to user for what to enter
        System.out.println("Enter the elements for 2nd array");

        // using for loop and scanner object to take user input elements according to the user input array size for array 2
        for (int i = 0; i < array2.length; i++)
        {
            array2[i] = scanner.nextLine();
        }

        // using inbuilt Array method to print elements in string
        System.out.println("Array 1: "+Arrays.toString(array1));
        System.out.println("Array 2: "+Arrays.toString(array2));

        System.out.println("\nCommon elements are: ");

        for (int i=0;i<array1.length;i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i].equals(array2[j]))
                {
                    System.out.println(array1[i]+ " ");
                }
            }

        }
    }
}