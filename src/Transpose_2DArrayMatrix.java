import java.util.Scanner;

// Writing a program to transpose 2 dimensional array matrix using scanner class
public class Transpose_2DArrayMatrix
{
    // creating object for scanner class to take input
    Scanner scanner = new Scanner(System.in);




    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        Transpose_2DArrayMatrix transpose_2DArrayMatrix=new Transpose_2DArrayMatrix();

        // calling method using class object
        transpose_2DArrayMatrix.transposeMatrix();

    }



    // No return no parameters
    public void transposeMatrix()
    {
        // message to user for what to enter
        System.out.println("Enter total rows : ");

        // storing variable using scanner object
        int row = scanner.nextInt();

        // message to user for what to enter
        System.out.println("Enter total columns: ");

        // storing variable using scanner object
        int column = scanner.nextInt();

        // Storing variables
        int i, j;

        // declaration and instantiation of array
        int array[][] = new int[row][column];

        System.out.println("Enter matrix pressing enter after every input:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                array[i][j] = scanner.nextInt();
                System.out.print(" ");
            }
        }
        // using for loop to create originalMatrix as rectangular two dimensional array
        System.out.println("\nThe above matrix before Transpose is ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }

        // using forloop to create 2 dimensional matrix after transpose
        System.out.println("\nThe above matrix after Transpose is ");
        for(i = 0; i < column; i++)
        {
            for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
