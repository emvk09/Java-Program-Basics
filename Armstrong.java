import java.util.Scanner;
public class Armstrong
{
    public static void main(String arr[])
    {
        int num, cpy_num, rem= 0, n, sum= 0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        num= in.nextInt();
        cpy_num= num;

        // Counting the number of digits in num

        for(n= 0; num != 0; n++)
            num=num/ 10;

        num= cpy_num;   /* we are writing this line because the value of num was changed in above forloop */

        while (num != 0)
        {
            rem = num % 10;
            sum = sum + (int)Math.pow(rem, n);               
            num = num / 10;
        }
        if (sum == cpy_num)
            System.out.format("%d is an Armstrong number.", cpy_num);
        else
            System.out.format("%d is not an Armstrong number.", cpy_num);
    }
}