import java.util.Scanner;
public class Add
{
    public static void main(String arr[])
    {
        int n1, n2, sum;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the 1st number:");
        n1= in.nextInt();
        System.out.println("Enter the 2nd number:");
        n2= in.nextInt();
        sum=n1+n2;
        System.out.println("The sum is: "+sum);
    }
}
