import java.util.Scanner;
public class StudentDetails
{
    public static void main(String arr[])
    {
        int n, sem;
        String name, dump;
        float sgpa;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the roll number:");
        n= in.nextInt();
/*Actually nextLine() method of Scanner skips the console input, when we use it 
after next(), nextInt() and all nextXXX() methods. Because next() and nextXXX() 
input methods doesn’t process/consider the newline character (When you press ENTER 
key after input them) and that newline character processed by nextLine() method. 
Therefore nextLine() method doesn’t read the input (which you wished for). 
To overcome this problem, you have to invoke an extra nextLline() method after next() 
and nextXXX().*/
// dump is used to solve this error
        dump= in.nextLine();
        System.out.println("Enter the name: ");
        name= in.nextLine();
        System.out.println("Enter the semester:");
        sem= in.nextInt();
        System.out.println("Enter the sgpa:");
        sgpa= in.nextFloat();
        System.out.println("The details are \nRoll number: "+ n +"\nName: "+ name+"\nSemester: "+ sem +"\nSGPA: "+sgpa);
    }
}