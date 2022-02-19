package studpack;

interface Sports
{
    int grade = 100;
    void displayName();
    void displayRoll();
    void displayGrade();
    void displayTotal();
}

class Student
{
    String name;
    int rollno;
    float mark1, mark2, mark3;

    Student(String n, int r, float m1, float m2, float m3)
    {
        this.name= n;
        this.rollno= r;
        this.mark1= m1;
        this.mark2= m2;
        this.mark3= m3;
    }
}

public class Result extends Student implements Sports 
{
    float total;
    
    // All the parameters from the main program is passed to Result constructor
    public Result(String name, int rollNo, float mark1, float mark2, float mark3) 
    {
        // super calls the constructor with same parameters from the parent class.
        // Suppose if the parent class had only one constructor with no parameters at all, then there arises error 
        super(name, rollNo, mark1, mark2, mark3);
        total= mark1 + mark2 + mark3;
    }

    public void displayTotal()
    {
        displayName();
        displayRoll();
        displayGrade();
        System.out.println("Total obtained = " + total + "/300\n");
    }

    public void displayName()
    {
        System.out.println("Name = " + name);
    }

    public void displayRoll()
    {
        System.out.println("Roll no = " + rollno);
    }

    public void displayGrade()
    {
        System.out.println("Sports Grade = " + grade);
    }
}
