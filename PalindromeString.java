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
        if (sentence.equals(reverse))
            System.out.println("The string is palindrome.");
        else
            System.out.println("The string is not palindrome.");
    }
}
