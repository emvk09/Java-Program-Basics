/*Write a Java program that creates a class named 'Employee' having the following
members: Name, Age, Phone number, Address, Salary. It also has a method named 
'printSalary( )' which prints the salary of the Employee. Two classes 'Officer' and
'Manager' inherit the 'Employee' class. The 'Officer' and 'Manager' classes have data
members 'specialization' and 'department' respectively. Now, assign a name, age, 
phone number, address, and salary to an officer and a manager by making an object 
of both of these classes and print the same*/

public class EmployeeManagement
{
   public static void main(String arr[])
   {
      System.out.println("WAYNE ENTERPRISES\n\n");
      Officer off= new Officer("Hiyan", 56, 786112353, "Street 11,\nM.G. Road,\nAgra\n", 55000, "HR");
      off.printSalary();
      off.printSpec();
      Manager man= new Manager("Ashok", 60, 655533452, "No. 15,\nM.S.N. Street\nAgra\n", 74000, "Food and Safety");
      man.printSalary();
      man.printDep();
   }
}

class Employee
{
   String name;
   int age;
   int phno;
   String address;
   float salary;

   void printSalary()
   {
      System.out.println("Salary: " + salary);
   }

   void printInfo()
   {
      System.out.println("Name: " + name + "\nAge: " + age + "\nPhone number: " + phno + "\nAddress: " + address);
   }
}

class Officer extends Employee
{
   String specialization;
   Officer(String name, int age, int phno, String address, float salary, String specialization)
   {
      this.name= name;
      this.age= age;
      this.phno= phno;
      this.address= address;
      this.salary= salary;
      this.specialization= specialization;
      this.printInfo();
   }
   
   void printSpec() 
   {
      System.out.println("Specialization: " + specialization + "\n\n");
   }
}

class Manager extends Employee
{
   String department;
   Manager(String name, int age, int phno, String address, float salary, String department)
   {
      this.name= name;
      this.age= age;
      this.phno= phno;
      this.address= address;
      this.salary= salary;
      this.department= department;
      this.printInfo();
   }

   public void printDep() 
   {
      System.out.println("Department: " + department + "\n\n");
   }
}
