import java.util.Scanner;
public class Factorial
{
    public static void main(String arr[])
    {
        int num, fact= 1, i;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter a number:");
        num= in.nextInt();
        for (i= 1; i<= num; i++)
            fact= fact* i;
        System.out.format("The factorial is: %d", fact);
    }
}