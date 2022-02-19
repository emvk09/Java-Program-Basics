import NewPackage.NewClass;
import java.util.Scanner;

public class ParityCheck
{
    public static void main(String arr[])
    {
        int n;
        String a;
        NewClass np= new NewClass();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        n= sc.nextInt();
        a= np.parityCheck(n);
        System.out.println(a);
    }
}
