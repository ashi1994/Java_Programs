/**
A map contains values based on the key i.e. key and value pair.
It contains only unique elements.
It may have one null key and multiple null values.
it is not legacy class and not Syncronised
It maintains no order.
*/
package Collection;
import java.util.*;  
class HashMapexamle
 {
 
    public static void main(String a[])
    {
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("First","FIRST INSERTED");
        hm.put("Second","SECOND INSERTED");
        hm.put("Third","THIRD INSERTED");

        System.out.println(hm);
        
        //traversing of hashmap
        Set<String> st=hm.keySet();
        for(String key:st)
        	System.out.println("Value of "+key+" is: "+hm.get(key));
        
        //getting value from the given key from hashmap
        System.out.println("Value of second: "+hm.get("First"));

        System.out.println("Is HashMap empty? "+hm.isEmpty());
        
        //remove a key value from map
        hm.remove("Third");
       
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());
        System.out.println("check map contain first key or not..  "  +hm.containsKey("First"));
        System.out.println("check map contain THIS VALUR OR NOT  "  +hm.containsValue("THIRD INSERTED"));
    }
}
