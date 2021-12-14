import java.util.Scanner;
public class ArrayLargest
{
    public static void main(String arr[])

    {
        Scanner sc= new Scanner(System.in);
        int n, i;
        System.out.println("Enter the size of array:");
        n= sc.nextInt();
        int num[]= new int[n];

        System.out.println("Enter the array elements:");
        for (i= 0; i< n; i++)
            num[i]= sc.nextInt();

// largest condition

        for (i= 0; i< n; i++)
        {
            if (num[0] <= num[i])
                num[0]=num[i];
        }

        System.out.format("The largest of the array is %d", num[0]);
    }
}  