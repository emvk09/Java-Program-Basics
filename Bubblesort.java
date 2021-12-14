import java.util.Scanner;
public class Bubblesort
{
    public static void main(String arr[])
    {
        Scanner sc= new Scanner(System.in);
        int n, i, j, temp= 0;
        System.out.println("Enter the size of array:");
        n= sc.nextInt();
        int num[]= new int[n];

        System.out.println("Enter the array elements:");
        for (i= 0; i< n; i++)
            num[i]= sc.nextInt();

// RETURN LOOP FOR ACSENDING ORDER

        for(i= 0; i< n; i++)
        {
            for(j= i+1; j< n; j++)
            {
                if ( num[i] >= num[j])
                {
                    temp= num[i];
                    num[i]= num[j];
                    num[j]= temp;
                }
            }
        }

        System.out.format("The bubblesorted array is: \n");
        for (i= 0; i< n; i++)
        System.out.println(num[i]);
    }
}  