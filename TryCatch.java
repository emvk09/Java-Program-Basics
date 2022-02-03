import java.util.*;

public class TryCatch
{
    public static void main (String arr[])
    {
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of A:");
        a= sc.nextInt();
        System.out.println("Enter the value of B:");
        b= sc.nextInt();

        try
        {
            int c= a/b;
            System.out.println("c= " + c);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("The Error arises: " + e);
        }
        finally
        {
            System.out.println("Try catch executed successfully.");
        }
        sc.close();
    }
}
