import java.util.Scanner;
public class Prime 
{
    public static void main(String arr[])
    {
        int n, i= 2, stat= 0;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the number:");
        n= in.nextInt();    
        for (i = 2; i < n/2 ; i++) 
        {
            if (n % i == 0) 
            {
                stat = 1;
                break;
            }
        }
        if (n == 1) 
            System.out.println("1 is neither prime nor composite.");
        else 
        {
            if(stat == 1)
                System.out.println(n +" is a composite number.");
            else
                System.out.println(n +" is prime number.");
        }
    }
}
