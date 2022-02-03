import java.util.*;

public class StringTokenizerEx
{
    public static void main(String arr[])
    {
        String str, temp;
        int n, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers with one space gap:");
        str= sc.nextLine();
        System.out.println("\n");

        StringTokenizer st= new StringTokenizer(str, " ");  //breaks the string str into tokens based on parameter

        while(st.hasMoreTokens())
        {
            temp= st.nextToken();
            n= Integer.parseInt(temp);  //converts the string tokens in temp to integers
            System.out.println(n);
            sum+= n;
        }
        System.out.println("Sum : " + sum);
        sc.close();
    }
}
