import java.util.*;

public class RandomThreadTest
{
	public static void main(String arr[]) 
	{
        Thread rn= new Thread(new RandomThread());
        rn.start();
	}
}

class RandomThread implements Runnable
{
    public void run()
    {
		// This is a predefined class for obtaing random variables, values, etc.
		Random r= new Random();
		for(int i=0; i< 10; i++)
		{
			// Here random numbers are generated each time in the for loop and are passed to num. Max range of number is 100 
			int n= r.nextInt(100);
			if (n % 2 == 0)
			{
				Thread ev= new Thread(new Even(n));
				ev.start();
			}
			else
			{
				Thread od= new Thread(new Odd(n));
				od.start();
			}
		}
    }
} 

class Even implements Runnable
{
	int num;
	Even(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("Square of " + num + " = " + num*num);
	}	
}

class Odd implements Runnable
{
	int num;
	Odd(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("Cube of " + num + " = " + num*num*num);
	}	
}