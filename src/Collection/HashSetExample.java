/**
 * List can contain duplicate elements whereas Set contains unique elements only.
 * HashSet does not maintain any order ,its according hashcode value of object
 * HashSet does not allow duplicates.
 * Postional access is not allowed in Set(i.e list.get(in index) not allowed)
 * Intial capacity 16
 * Load factor 0.75,means after filling 75% it create new object,if we have more elemeent.
 * HashSet allows null values.
 * HashSet is non-synchronize
 * 
 * Constructor--
 * HashSet h=new HashSet()
 * HashSet h=new HashSet(int capacity)
 * HashSet h=new HashSet(int capacity,float loadfacter)
 * HashSet h=new HashSet(Collection c)
 */
package Collection;
import java.util.HashSet;
public class HashSetExample
 {
   public static void main(String args[]) 
   {
      // HashSet declaration
      HashSet<String> hset = new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      
      //Addition of duplicate elements
      hset.add("Apple");// no any error when insert duplicate
      hset.add("Mango");
      
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      for(String disp:hset)
    	  System.out.println(disp);
      
    }
}