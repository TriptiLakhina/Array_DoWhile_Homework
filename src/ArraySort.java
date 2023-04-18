import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {
        ArraySort arraySort=new ArraySort();
        arraySort.sortInAscending();
    }


    void sortInAscending(){
        System.out.println("Enter the number of size of array");
       // int arraysize;
        int arraysize=scanner.nextInt();
        int[] a = new int[arraysize];




        System.out.println("Enter the elements for array");

            for (int i = 0; i < arraysize; i++)
            {
                a[i] = scanner.nextInt();


            }
        Arrays.sort(a);
        System.out.println("Ascending order: ");

        for (int i = 0; i <arraysize ; i++) {
            System.out.println(a[i]);
        }



    }
}
