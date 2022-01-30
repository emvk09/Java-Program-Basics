/*Write two Java classes, Employee and Engineer. The engineer should inherit from Employee class. Employee class is to have 
two methods display() and calcSalary(). Write a program to display the salary from Engineer class and to display from 
Employee class using a single object instantiation (i.e., only one object creation is allowed). 
display() only prints the name of the class and does not return any value. Ex. Name of class is Employee. 
calcSalary() in Employee displays, Salary of employee is 10000 and calcSalary() in Engineer displays, Salary of employee is 20000.*/


public class Employee
{
    int sal=10000;
    static void display(String classname)
    {
        System.out.println("Name of class is " + classname);
    }

    public void calcSalary()
    {
        System.out.println("Salary of employee is " + sal);
    }

    public static void main(String arr[])
    {
        Engineer obj= new Engineer();
        display("Employee");
        obj.calcSalary(20000);
    }
}

class Engineer extends Employee
{
    public void calcSalary(int salary)
    {
        super.calcSalary();
        System.out.println("Salary of employee is " + salary);
    }
}