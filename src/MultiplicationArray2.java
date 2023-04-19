public class MultiplicationArray2
{
// Writing a program to get multiplication table of 2 dimensional array
    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        MultiplicationArray2 multiplicationArray2 = new MultiplicationArray2();

        // calling method using class object
        multiplicationArray2.getTable();
    }


    // No return no parameters
    public void getTable()
    {
        // declaration and instantiation of 2D array
        int[][] table = new int[3][3];

        for (int row = 0; row < table.length; row++)
        {
            for (int col = 0; col < table.length; col++)
            {
                table[row][col] = (row + 1) * (col + 1);
            }
        }

        for (int row = 0; row < table.length; row++)
        {
            for (int col = 0; col < table.length; col++)
            {
                System.out.print(table[row][col] + "   ");
            }
            System.out.println("");
        }

    }
}
