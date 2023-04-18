import java.util.Scanner;

public class RemoveElement {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        RemoveElement removeElement=new RemoveElement();
        removeElement.deleteSpecificelement();
    }


    public void deleteSpecificelement(){


    int n, x, flag = 1, loc = 0;

        System.out.print("Enter no. of elements you want in array: \n");
    n = scanner.nextInt();
    int [] a = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
    {
        a[i] = scanner.nextInt();
    }
        System.out.print("Enter the element you want to remove: ");
    x = scanner.nextInt();
        for (int i = 0; i < n; i++)
    {
        if(a[i] == x)
        {
            flag =1;
            loc = i;
            System.out.println("Removed the element "+ x+ " successfully!");
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
