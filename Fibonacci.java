import java.util.Scanner;
public class Fibonacci
{
    public static void main(String arr[])
    {
        int num, ini= 0, fin= 1, i, ans= 0;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the number of elements:");
        num= in.nextInt();
        System.out.print("Fibonacci series : ");

        if (num == 1)
            System.out.print(ini);
        else if (num != 0)
            System.out.print(ini +" "+fin);

        for(i= 3; i<= num; i++)
        {
            ans= ini + fin;
            System.out.print(" " + ans);
            ini= fin;
            fin= ans;
        }
    
    }
}
