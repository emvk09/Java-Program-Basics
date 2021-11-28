import java.util.Scanner;
public class NaturalSum 
{
    public static void main(String arr[])
    {
        int n, i= 1, sum= 0;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the number:");
        n= in.nextInt();
        while (i<= n)
        {
            sum= sum+ i;
            i++;
        }
        System.out.println("The sum of natural numbers is " +sum);
    }
}
