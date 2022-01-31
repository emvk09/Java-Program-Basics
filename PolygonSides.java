/*Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). 
Provide three classes named Rectangle, Triangle, and Hexagon such that each one of the classes extends the class Shape. 
Each one of the classes contains only the method numberOfSides( ) that shows the number of sides in the given geometrical structures.*/

// Abstract classes cannot be instantiated but its subclasses can be.
// It can have constructors and static methods also.
// Abstract classes are used to hide the working part (or the important) of a of a program from the consumer or end user or another programmers
// In Abstract classes, we use only the declaration of methods, thus hiding the method implementation or the method defintion   
// In real scenario, implementation is provided by unknown creater of the particular program 

abstract class Shape 
{
    abstract void numberOfSides();
}

// Abstracted or hidden or definition part
class Triangle extends Shape 
{
    void numberOfSides() 
    {
    System.out.println("Triangle : 3");
    }
}

class Rectangle extends Shape 
{
    void numberOfSides() 
    {
        System.out.println("Rectangle : 4");
    }
}

class Hexagon extends Shape 
{
    void numberOfSides() 
    {    
        System.out.println("Hexagon : 6");
    }
}

// Visible or method calling part
public class PolygonSides 
{
    public static void main(String args[]) 
    {
        Triangle tri = new Triangle();
        Rectangle rec = new Rectangle();
        Hexagon hex = new Hexagon();
        tri.numberOfSides();
        rec.numberOfSides();
        hex.numberOfSides();
    }
}
