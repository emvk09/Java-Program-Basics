
abstract class Shape 
{
    abstract void area(int x, int y);
}

class Triangle extends Shape 
{
    void area(int b, int h) 
    {
        int a;
        a= (b * h)/2;
        System.out.println("Area Triangle : " + a);
    }
}

class Rectangle extends Shape 
{
    void area(int l, int b) 
    {
        int a= l * b;
        System.out.println("Area Rectangle : " + a);
    }
}

public class AbstractShapeArea 
{
    public static void main(String args[]) 
    {
        Triangle tri = new Triangle();
        Rectangle rec = new Rectangle();
        tri.area(10, 20);
        rec.area(10, 30);
    }
}