import java.util.Arrays;
import java.util.Scanner;

public class Array_Equality {
    Scanner scanner=new Scanner(System.in);




    public static void main(String[] args){
        Array_Equality array_equality=new Array_Equality();
        array_equality.testArrayEquality();


    }



    public void testArrayEquality(){

        System.out.println("Enter the number of size of array1");
        int arraysize1;
        arraysize1=scanner.nextInt();
        int[] a = new int[arraysize1];


        System.out.println("Enter the elements for 1st array");
        for (int i = 0; i < arraysize1; i++) {
            a[i]=scanner.nextInt();
        }

        System.out.println("Enter the number of size of array2");
        int arraysize2;
        arraysize2=scanner.nextInt();
        int[] b = new int[arraysize2];


        System.out.println("Enter the elements for 2nd array");
        for (int i = 0; i < arraysize2; i++) {
            b[i]=scanner.nextInt();
        }




       boolean result=Arrays.equals(a,b);


        if (result==true){
            System.out.println("Two arrays are equal");
        } else {
            System.out.println("Two arrays are not equal");
        }









    }
}
