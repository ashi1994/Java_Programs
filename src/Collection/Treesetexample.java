/**
 * Contains unique elements only like HashSet.
 * Maintains ascending order.
 * No dulicate
 * Constructer--
 * 
 * TreeSet()--It is used to construct an empty tree set that will be sorted in an ascending order according to the natural order of the tree set
 * TreeSet(Collection c)--It is used to build a new tree set that contains the elements of the collection c.
 * TreeSet(Comparator comp)--It is used to construct an empty tree set that will be sorted according to given comparator.
 * TreeSet(SortedSet ss)--It is used to build a TreeSet that contains the elements of the given SortedSet.
 */
package Collection;
import java.util.*;  
class Treesetexample
{  
 public static void main(String args[])
 {  
   
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  al.add("ajay");
  
  Iterator<String> itr=al.iterator();

  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  
