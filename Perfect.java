import java.util.Scanner;
public class Perfect
{
    public static void main(String arr[])
    {
        int n, i, sum=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        n= in.nextInt();
        for(i=1; i<= n/2; i++)
        {
            if(n % i == 0)
                sum= sum + i;
        }
        if (n == sum)
            System.out.println(n+" is a perfect number.");
        else
            System.out.println(n+" is not a perfect number.");
    }
}