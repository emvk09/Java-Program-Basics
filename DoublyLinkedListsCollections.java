import java.util.*; 
public class DoublyLinkedListsCollections 
{ 
    public static void main ( String args []) 
    { 
        LinkedList<String> dl= new LinkedList<String>();   
        System.out.println("Initial list: " + dl); 
        dl.add("Greenu" ); 
        dl.add("Hazel" ); 
        dl.add("Samuel" ); 
        dl.add("NP"); 
        dl.add("Sarah" ); 
        System.out.println("List After Insertion : " ); 

        Iterator<String> itr= dl.iterator(); 
        while(itr.hasNext())  
            System.out.println(itr.next());

        dl.remove("NP"); 
        dl.remove(3); 
        System.out.println("List After Removing 'NP' and index '3' : " ); 

        Iterator<String> rti= dl.iterator(); 
        while (rti.hasNext())  
            System.out.println(rti.next()); 
    } 
}