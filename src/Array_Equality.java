import java.util.Arrays;
import java.util.Scanner;

// Writing a program to check if two user input arrays are equal
public class Array_Equality
{
    // Creating object for scanner class to take input
    Scanner scanner=new Scanner(System.in);




    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        Array_Equality array_equality=new Array_Equality();

        // calling method using class object
        array_equality.testArrayEquality();

    }



    // No return no parameters
    public void testArrayEquality()
    {

        // message to user for what to enter
        System.out.println("Enter the number of size of array 1");

        // storing variable using scanner object
        int arraysize1=scanner.nextInt();

        // declaration and instantiation of array
        int[] a = new int[arraysize1];


        // message to user for what to enter
        System.out.println("Enter the elements (numbers) for 1st array");

        // using for loop and scanner object to take user input elements according to the user input array size
        for (int i = 0; i < arraysize1; i++)
        {
            a[i]=scanner.nextInt();
        }

        // message to user for what to enter
        System.out.println("Enter the number of size of array 2");

        // storing variable using scanner object
        int arraysize2=scanner.nextInt();

        // declaration and instantiation of array
        int[] b = new int[arraysize2];


        // message to user for what to enter
        System.out.println("Enter the int elements for 2nd array");

        // using for loop and scanner object to take user input elements according to the user input array size for 2nd array
        for (int i = 0; i < arraysize2; i++)
        {
            b[i]=scanner.nextInt();
        }


        // storing and initializing variable using inbuilt array method to check if the arrays are equal
        boolean result=Arrays.equals(a,b);



        if (result==true)
        {
            System.out.println("Two arrays are equal");
        } else
        {
            System.out.println("Two arrays are not equal");
        }

    }
}
