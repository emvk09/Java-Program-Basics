import java.util.*;

class Operations
{
    Scanner sc= new Scanner(System.in);
    int Maxsize;
    int top;
    int stack[];
    Operations(int size)
    {
        top= -1;
        stack= new int[size];
    }

    void push()
    {
	    int x;
	    if (top == Maxsize- 1)
		    System.out.println("The stack is full.\n");
	    else
	    {
		    System.out.println("Enter the number: ");
		    x= sc.nextInt();
		    top++;
		    stack[top]= x;
	    }
    }

    void pop()
    {
	    if (top ==- 1)
            System.out.println("The stack is empty.\n");
	    else
	    {
		    System.out.format("Popped element: %d\n", stack[top]);
		    top--;
	    }
    }

    void display()
    {
	    if (top ==- 1)
            System.out.println("The stack is empty.\n");
	    else
	    {
		    System.out.println("Stack:");
		    for(int i= top; i>= 0; i--)
                System.out.format("%d\n", stack[i]);
	    }
    }
}


public class StackOperations 
{
    public static void main(String arr[])
    {
        int option, size;
        Scanner sc= new Scanner (System.in);
        System.out.println("\nEnter the maximum size of stack:");
        size= sc.nextInt();

        /* Here We are assigning the value of size variable to both the constructor ( Operation() )
        and the instance variable called Maxsize.
        We are inputing the value to the constructor because we cannot initialize the values in the 
        class Operations. We can only declare in the class Operations. Same is also for the case of arrays.
        eg: top= -1 ; This Initialization statement cannot be written in the class Operation alone.
                      Only Declaration (int top;) can be done in that class
                      The value must be initialized only inside a constructor. 
					  These values can be assigned as a statement in the constructor body or passed as arguments.*/ 


        Operations object= new Operations(size);
        object.Maxsize= size;
	    while(true)
	    {
		    System.out.println("\nOption 1: Push\nOption 2: Pop\nOption 3: display\nOption 4: Exit\n");
		    System.out.println("Enter the option number: ");
		    option= sc.nextInt();
		    switch(option)
		    {
			    case 1: object.push();
					break;
			    case 2: object.pop();
					break;
			    case 3: object.display();
					break;
			    case 4: System.exit(0);
			    default:
                    System.out.println("Invalid option. Try again\n");
		    }
	    }
    }    
}
