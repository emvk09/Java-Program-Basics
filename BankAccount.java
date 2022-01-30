import java.util.*;

// If we want to call the constructor from the same class, then we use this keyword.
// If we want to call the constructor from the parent class, then we use the super keyword.

public class BankAccount
{
    public static void main(String arr[])
    {
        // passing the values in parameterized constructors for user 1 and calling it
        AccDetails user1= new AccDetails("Tony Stark", "AC0506989428", "Current", 999999);
        user1.credit(500000);
        user1.debit(120000);

        // passing the values in parameterized constructors for user 1 and calling it
        AccDetails user2= new AccDetails("Bruce Wayne", "AC0567035168", "Savings", 700000);
        user2.credit(500000);
        user2.debit(100000000);
    }
}

class AccDetails
{
    private String Name;
    private String accNo;
    private String accType;
    private double accBalance;

    AccDetails()
    {
        System.out.println("--------------------\nWELCOME TO ADCB BANK\n");
    }

    AccDetails(String Name, String accNo, String accType, double accBalance)
    {
        // this() calls the constructor with no parameters from the same class 
        this();
        // this.Name refers to instance variable and Name refers to local variable of constructor
        this.Name= Name;
        this.accNo= accNo;
        this.accType= accType;
        this.accBalance= accBalance;
        accInfo();
    }

    public void accInfo()
    {
        System.out.println("||||| Account Details |||||\n");
        System.out.println("** Account Holder Name : " + Name);
        System.out.println("** Account Number : " + accNo);
        System.out.println("** Account Type : " + accType);
        System.out.println("** Account Balance : " + accBalance);
        System.out.println("!! Happy Banking !!\n");
    }

    public void credit(double amt)
    {
        accBalance += amt;
        System.out.println("Credited: " + amt);
        System.out.println("New Balance: " + accBalance + "\n"); 
    }

    public void debit(double amt)
    {
        if (accBalance > amt)
        {
            accBalance -= amt;
            System.out.println("Debited: " + amt);
            System.out.println("New Balance: " + accBalance + "\n");
        }
        else
        {
            System.out.println("Insufficient Balance !!");
            System.out.println("Balance: " + accBalance + "\n");
        }
    }
}