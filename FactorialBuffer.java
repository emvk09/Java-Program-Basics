import java.io.*;

public class FactorialBuffer
{
    public static void main(String arr[]) throws IOException 
    {
        int i, n, fact= 1;
        System.out.println("Enter the number:");

        // InputStreamReader converts byte to character. It reads bytes and decodes them into characters. 
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // readLine method stores the input as strings. parseInt converts them to int.
        n= Integer.parseInt(br.readLine()); 
        for(i= 1; i<= n; i++)
            fact=fact*i;
        System.out.println("Factorial is : " + fact);

        br.close();
    }
}

