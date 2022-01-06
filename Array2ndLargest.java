import java.util.Scanner;
public class Array2ndLargest
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
            for(j= 0; j< n-i-1; j++)
            {
                if ( num[j] >= num[j+ 1])
                {
                    temp= num[j];
                    num[j]= num[j+ 1];
                    num[j+ 1]= temp;
                }
            }
        }

    // PRINTING 2nd ELLEMENT OF THE ARRRANGED ARRAY

        System.out.format("The 2nd smallest element is %d",  num[1]);
        System.out.format("The 2nd largest element is %d",  num[n-2]);
    }
}  
