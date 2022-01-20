import java.util.*;

public class SumDigitsRecursion
{
    public static void main(String arr[])
    {
        int num, sum= 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        num= sc.nextInt();
        sum= fact_sum(num);
        System.out.println("The sum is " + sum);
    }

    static int fact_sum(int n)
    {
        if (n == 0)
            return 0;
        return ((n%10) + fact_sum(n/10));
    }
}