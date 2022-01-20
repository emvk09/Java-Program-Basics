import java.util.Scanner;

public class PalindromeString
{
    public static void main(String arr[])
    {
        int ln, i;
        String sentence, reverse="";
        Scanner sc= new Scanner (System.in);
        System.out.println("\nEnter the string:");
        sentence= sc.nextLine();
        ln= sentence.length();
        for (i= ln- 1; i >= 0; i--)
            reverse= reverse + sentence.charAt(i);
        System.out.println("The reverse of string is "+ reverse);
    }
}