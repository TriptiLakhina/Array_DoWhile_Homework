import java.util.Scanner;

// Writing a program to remove user defined element from user defined array
public class RemoveElement
{
    // Creating object for scanner class to take input
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        RemoveElement removeElement=new RemoveElement();

        // calling method using class object
        removeElement.deleteSpecificelement();
    }

    // No return no parameters
    public void deleteSpecificelement()
    {
        // message to user for what to enter
        System.out.print("Enter no. of elements you want in array: \n");

        // storing variable using scanner object
        int n = scanner.nextInt();

        // Storing and Initializing the variables
        int flag = 1, loc = 0;

        // declaration and instantiation of array
        int [] a = new int[n];

        // message to user for what to enter
        System.out.println("Enter all the elements in integers:");

        // using for loop and scanner object to take user input elements according to the user input array size
        for (int i = 0; i < n; i++)
    {
        a[i] = scanner.nextInt();
    }
        // message to user to write the element that needs to be removed
        System.out.print("Enter the element you want to remove: ");

        // storing variable using scanner object
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++)
    {
        if(a[i] == x)
        {
            flag =1;
            loc = i;
            System.out.println("Removed the 1st occurrence of element "+ x+ " successfully!");
            break;
        }
        else
        {
            flag = 0;
        }
    }
        if(flag == 1)
    {
        for(int i = loc+1; i < n; i++)
        {
            a[i-1] = a[i];
        }

        System.out.print("\nThe new array is: ");
        for (int i = 0; i < n-2; i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.print(a[n-2]);
    }
        else
    {
        System.out.println("Invalid input - Element not found");
    }
}
}
