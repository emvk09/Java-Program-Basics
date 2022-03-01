public class DoublyLinkedLists 
{  
    public static void main(String[] args) 
    {  
        DoublyLinkedLists dll = new DoublyLinkedLists();  
        dll.addNode(1);  
        dll.addNode(2);  
        dll.addNode(3);  
        dll.addNode(4);  
        dll.addNode(5); 
        System.out.println("Before Deletion");
        dll.display();  
        dll.delete(3);
        System.out.println("\nAfter Deleting 3");
        dll.display();  
    }  

    //Represent a node of the doubly linked list  
    class Node
    {  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) 
        {  
            this.data= data;  
        }  
    }  
    Node head= null, temp= null;  

    public void addNode(int data) 
    {  
        //Create a new node  
        Node newnode= new Node(data);  
        newnode.previous= null;
        newnode.next= null;
 
        if(head == null)    // this is the case for the first node added
            head= temp= newnode;   
        else 
        {  
            temp.next= newnode;   
            newnode.previous= temp;    
            temp= newnode;  //newnode will become new temp
        }  
    }  
  
    public void display() 
    {  
        System.out.println("Doubly linked list: ");
        if(head == null) 
            System.out.println("List is empty!!");  
          
        for(temp= head; temp!= null; temp= temp.next)
            System.out.print(temp.data + "  ");
    }  

    public void delete(int n) 
    {  
        Node prevnode= null;
        if(head == null) 
            System.out.println("List is empty!!");  
        else
        {  
            for(temp= head; temp!= null; temp= temp.next)
                if (temp.data == n) //if this condition is true, then temp will be address of the node to be deleted
                {
                    prevnode= temp.previous; // prevnode is used to obtain the address of the previous node; ie, the node just before the temp.
                    prevnode.next= temp.next;

                    // we need access the next node after the temp node and change its prev pointer
                    // But this should happen only if the newnode created wasn't the last node in the list
                    if (temp.next != null)
                    {
                        temp.next.previous= prevnode;
                        // free(temp);
                    }
                    else if (head == temp) // This condition checks if the node to be deleted is the starting node itself. 
                    {
                        head= temp.next;
                        // free(temp);
                    }
                }
                // else
                    // System.out.println("Element not found!!");
        }
    }  
}