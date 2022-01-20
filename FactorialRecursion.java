import java.util.Scanner;

public class FactorialRecursion
{
    public static void main(String arr[])
    {
        Scanner sc= new Scanner (System.in);
        int fact= 0, n;
        System.out.println("Enter the number:");
        n= sc.nextInt();
        fact= factorial(n);
        System.out.format("The factorial is: %d", fact);
    }

    static int factorial(int a)
    {
        if (a > 1)
            return(a * factorial( a- 1));
        else
            return 1;
    }
}

/* If we want to implement the program without static, we have to create an new object of the class and 
then call the method (function) with reference to the new object created */


// import java.util.Scanner;
// public class FactorialRecursion
// {
//     public static void main(String arr[])
//     {
//         Scanner sc= new Scanner (System.in);
//         int fact= 0, n;
//         System.out.println("Enter the number:");
//         n= sc.nextInt();

//         FactorialRecursion ob = new FactorialRecursion();
        
//         fact= ob.factorial(n);
//         System.out.format("The factorial is: %d", fact);
//     }

//     int factorial(int a)
//     {
//         if (a > 1)
//             return(a * factorial( a- 1));
//         else
//             return 1;
//     }
// }