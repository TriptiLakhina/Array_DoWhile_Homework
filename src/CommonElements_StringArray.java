import java.util.Arrays;
import java.util.Scanner;

public class CommonElements_StringArray
{

    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args)
    {
        CommonElements_StringArray commonElements_stringArray = new CommonElements_StringArray();
        commonElements_stringArray.findCommonElements();


    }


    public void findCommonElements()
    {
        System.out.println("Enter the size of 1st array");
        int arraysize1 = scanner.nextInt();
        String[] array1 = new String[arraysize1];

        System.out.println("Enter the elements for 1st array");
        //   String array1[]=scanner.nextLine();
        for (int i = 0; i < array1.length; i++)
        {
            String str = array1[i];
            // System.out.println(str);
            array1[i] = scanner.nextLine();
        }


        System.out.println("Enter the size of 2nd array");
        int arraysize2 = scanner.nextInt();
        String[] array2 = new String[arraysize2];

        System.out.println("Enter the elements for 2nd array");
        //   String array1[]=scanner.nextLine();
        for (int i = 0; i < array2.length; i++)
        {
            String str = array2[i];
            // System.out.println(str);
            array2[i] = scanner.nextLine();
        }
        System.out.println("Array1: "+Arrays.toString(array1));
        System.out.println("Array2: "+Arrays.toString(array2));

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