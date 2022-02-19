import java.util.*;

public class ArrayListCollections
{
    public static void main(String args[])
    {
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("Apple");
        arr.add("Orange");
        arr.add("Grapes");
        arr.add("Banana");
        arr.add("Mango");

        System.out.println("Initial list:");
        for(String i: arr)
            System.out.println(i);

        System.out.println("Returning the element with index 2: " + arr.get(2));

        System.out.println("Changing the element with index 2: " + arr.set(2, "Pinapple"));

        System.out.println("Printing the final list:");
        for(String i: arr)
            System.out.println(i);
    }
}