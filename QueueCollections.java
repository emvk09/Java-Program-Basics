import java.util.*;

public class QueueCollections
{
    public static void main(String arr[])
    {
        Queue<Integer> q= new LinkedList<Integer>();
        System.out.println("Initial contents in the Queue: " + q);
        System.out.println("Initial size of the queue: " + q.size());

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Contents in the Queue: " + q);
        System.out.println("Size of the queue: " + q.size());

        System.out.println("Popped element using remove(): " + q.remove());
        System.out.println("Peeked element using peek(): " + q.peek());
        System.out.println("Popped element using poll(): " + q.poll());
        System.out.println("Peeked element using element(): " + q.element());

        System.out.println("Final Queue:");
        Iterator itr = q.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }
}