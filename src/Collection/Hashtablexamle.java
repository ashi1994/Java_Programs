/**
 * Synchronised
 * No any null key and value
 * Legacy class
 */

package Collection;
import java.util.*;  
class Hashtablexamle
{  
 public static void main(String args[])
 {  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  hm.put(103,"Rahul");//unique key if two types it print only one times
  //hm.put(null,null);//Exception in thread "main" java.lang.NullPointerException
  //traversing of map
Set<Integer> s=hm.keySet();
  for(int key:s)
  {  
   System.out.println("Value of "+key+" is: "+hm.get(key)); 
  }  
  //remove a key
  hm.remove(100);
  System.out.println(hm);
  
  //check size
  System.out.println(hm.size());
  
  //check key exist or not
  System.out.println(hm.containsKey(100));
  
  //check value exist or not
  System.out.println(hm.containsValue("Ravi"));
  
  //get value from key
  System.out.println(hm.get(103));
 }  
} 