import java.util.Scanner;

public class Transpose_2DArrayMatrix {

    Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {
        Transpose_2DArrayMatrix transpose_2DArrayMatrix=new Transpose_2DArrayMatrix();
        transpose_2DArrayMatrix.transposeMatrix();


    }

    public void transposeMatrix(){
        int i, j;
        System.out.println("Enter total rows and columns: ");

        int row = scanner.nextInt();
        int column = scanner.nextInt();

        // Create originalMatrix as rectangular two dimensional array
        int array[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                array[i][j] = scanner.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The above matrix before Transpose is ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The above matrix after Transpose is ");
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
