import java.util.Scanner;
public class Fibonacci
{
    public static void main(String arr[])
    {
        int num, ini= 0, fin= 1, i, ans= 0;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the number of elements:");
        num= in.nextInt();
        System.out.format("The first %d Fibonacci series are:\n", num);
        System.out.println(ini +"\n"+ fin);
        for(i= 3; i<= num; i++)
        {
            ans= ini + fin;
            System.out.println(ans);
            ini= fin;
            fin= ans;
        }
    }
}
