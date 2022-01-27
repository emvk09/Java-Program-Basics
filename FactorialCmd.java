public class FactorialCmd
{
    public static void main (String arr[])
    {
        int a, i,fact= 1;
        a=  Integer.parseInt(arr[0]); //The parseInt function converts its first argument to a string, parses that string, then returns an integer
        for(i= 1; i<= a; i++)
            fact= fact* i;
        System.out.println("The factorial is : " + fact);
    }
}
