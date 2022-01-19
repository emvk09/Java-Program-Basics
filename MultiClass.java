import java.util.Scanner;

class Box
{
    float length;
    float width;
    float height;
    float volume()
    {
        return (length* width* height);
    }
}

class MultiClass
{
    public static void main(String arr[])
    {
        float l, w, h, v;
        Scanner sc= new Scanner (System.in);
        System.out.println("\nLength:");
        l= sc.nextFloat();
        System.out.println("Width:");
        w= sc.nextFloat();
        System.out.println("Height:");
        h= sc.nextFloat();
        Box objectbox= new Box();
        objectbox.length= l;
        objectbox.width= w;
        objectbox.height= h;
        v= objectbox.volume();
        System.out.println("The volume is: " + v);
    }
}
