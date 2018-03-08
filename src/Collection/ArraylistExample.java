/**
 * Java ArrayList class uses a dynamic array for storing the elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList allows random access because array works at the index basis.
 * It uses Dynamic array to store the element
 * Null allowed
 * Constructer----
 * ArrayList<String> al = new ArrayList<String>(Collection c)
 * ArrayList<String> al = new ArrayList<String>()
 * ArrayList<String> al = new ArrayList<String>(int capacity)
 */
package Collection;
import java.util.*;
public class ArraylistExample
{
   public static void main(String[] args) 
   {
       // ArrayList of String type
       ArrayList<String> al = new ArrayList<String>(5);
       //default size is 10
       // simple add() methods for adding elements at the end

       al.add("Hi");
       al.add("hello");
       al.add("String");
       al.add("Test");
       al.add("aisse");
       System.out.println("Elements after adding:"+ al);
       
       /*adding element*/
       
       al.add(3,"Howdy");
       al.add(0, "Bye");

       System.out.println("Elements after adding string :"+ al);
       System.out.println(al.size());
    
       /*Print*/
       System.out.println("Elements after adding string bye:"+ al);

      /*Traverse of element*/
       System.out.println("Traverse using Iterator Interface");
       Iterator itr=al.iterator();
          while(itr.hasNext())
            System.out.println(itr.next());
          
          /*Remove elements from array list like this*/
          al.remove("Bye");
          
          /*Remove element from the given index*/
    	  al.remove(1);
          
        /*Alternate way to traverse*/
          System.out.println("Traverse using FOR EACH LOOP");
          for(String s1:al)
        	  System.out.println(s1);

          /*Set used to replaces the element present at the specified index */
          al.set(4, "setted elemtent");
          System.out.println("After setting the element "+al);

          System.out.println("Is arraylist empty? "+al.isEmpty()); 
          System.out.println("Index of howdy is "+al.indexOf("Howdy")); 
          System.out.println("Size of the arraylist is: "+al.size());
   }
}