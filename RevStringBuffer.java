import java.util.Scanner;

public class RevStringBuffer
{
    public static void main(String arr[])
    {
        String sentence;
        Scanner sc= new Scanner (System.in);
        System.out.println("\nEnter the string:");
        sentence= sc.nextLine();
        StringBuffer sbf= new StringBuffer(sentence);
        sbf.reverse();
        System.out.println("The reverse of string is "+ sbf);
    }
}
