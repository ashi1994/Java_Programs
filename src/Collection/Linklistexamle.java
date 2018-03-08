package Collection;
/**
 * Default size of linklist is 0.
 * Java ArrayList class uses a dynamic array for storing the elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList allows random access because array works at the index basis.
 * It uses Doubly Linked List array to store the element
 * Java LinkedList class is non synchronized.
 * Constructer---
 * LinkedList<String> linkedlist = new LinkedList<String>()
 * LinkedList<String> linkedlist = new LinkedList<String>(Collection c)
 */
import java.util.LinkedList;
import java.util.Iterator;
public class Linklistexamle {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    //Diamond Opertor
    LinkedList<String> li=new LinkedList<>();
    
    
    // Add elements to LinkedList
    linkedlist.add("Delhi");
    linkedlist.add("Agra");
    linkedlist.add("Mysore");
    linkedlist.add("Chennai");
    linkedlist.add("Pune");
 
    // Adding new Element at 5th Position 
    linkedlist.add(4, "NEW ELEMENT");
    System.out.println("After add value " +linkedlist);
    
    //when we set value then it replace the existing elemeent.
    linkedlist.set(3, "ANUP");

    System.out.println("After setting value " +linkedlist);

    // Iterating the list in forward direction
    System.out.println("LinkedList elements After Addition:");
    
    //Adding element at First and Last position
    linkedlist.addFirst("first");
    linkedlist.addLast("last");
    
    //Remove element form first and Last
    linkedlist.removeLast();
    linkedlist.removeFirst();
    
    
    //Getting First and Last element
    System.out.println(linkedlist.getFirst());
    System.out.println(linkedlist.getLast());
    
    //traversing of linklist
    Iterator<String> it= linkedlist.iterator();
    while(it.hasNext()){
       System.out.println(it.next());
    }
 }
}