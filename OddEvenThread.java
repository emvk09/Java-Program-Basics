import java.util.Scanner;

public class OddEvenThread 
{
	public static void main(String arr[]) 
	{
		int limit;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the limit : ");
		limit= sc.nextInt();
		Odd od = new Odd(limit);
		Even ev = new Even(limit);
		od.start();
		ev.start();
        sc.close();
	}
}

class Odd extends Thread
{
	int limit;
	public Odd(int lm) 
	{
		limit = lm;
	}
	public void run() 
	{
		for (int n= 0; n<= limit; n+=2) 
		{
			System.out.println("Even thread : " + n);
			try
            {
                Thread.sleep(1000);
            } 
            catch(Exception e) {}
		}
	}
}

class Even extends Thread
{
	int limit;
	public Even(int lm) 
	{
		limit = lm;
	}
	public void run() 
	{
		for (int n= 1; n<= limit; n+=2) 
		{
			System.out.println("Odd thread : " + n);
			try
            {
                Thread.sleep(1000);
            } 
            catch(Exception e) {}
		}
	}
}