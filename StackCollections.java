import java.util.*;

public class StackCollections
{
    public static void main(String arr[])
    {
        // When we mention <Integer>, it means the datatype of the data stored in object is Integer
        // If we donot mention it, data will be simply stored in the object without any datatype
        Stack<Integer> st= new Stack<Integer>();
        System.out.println("Initial contents in the Stack: " + st);
        System.out.println("Initial size of the stack: " + st.size());
        System.out.println("IsEmpty: " + st.empty());

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Contents in the Stack: " + st);
        System.out.println("Size of the stack: " + st.size());
        System.out.println("IsEmpty: " + st.empty());

        System.out.println("Popped element: " + st.pop());
        System.out.println("Peeked element: " + st.peek());

        System.out.println("Contents in the Stack: " + st);
        System.out.println("Size of the stack: " + st.size());

        System.out.println("Position of 10: " + st.search(10));
        System.out.println("Position of 30: " + st.search(30));
    }
}