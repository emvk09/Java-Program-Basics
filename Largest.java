import java.util.Scanner;
public class Largest 
{
    public static void main(String arr[])
    {
        int n1, n2;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the 1st number:");
        n1= sc.nextInt();
        System.out.println("Enter the 2nd number:");
        n2= sc.nextInt();
        if (n1 > n2)
            System.out.println("The largest is: "+ n1);
        else
            System.out.println("The largest is: "+ n2);
    }
}
