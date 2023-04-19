public class MultiplicationDoWhile
{
// Writing a program to get 3 x 3 multiplication table using Do While

    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        MultiplicationDoWhile multiplicationDoWhile=new MultiplicationDoWhile();

        // calling method using class object
        multiplicationDoWhile.getTable();
    }



    // No return no parameters
    public void getTable()
    {
        // Storing and Initializing the variables
        int tablesize=3;
        int factor1=1;

        System.out.println("Multiplication table: ");

        // using do while to print the multiplication table in 3 x 3 format
        do
        {
            int factor2=1;

            do
            {
                int result = factor1 * factor2;
                System.out.print(result + "  ");
                factor2++;
            }while (factor2<=tablesize);

            System.out.println();
            factor1++;
        }while (factor1<=tablesize);

    }
}
