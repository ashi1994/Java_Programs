
//A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
//It contains only unique elements.
//It cannot have null key but can have multiple null values.
//It is same as HashMap instead maintains ascending order.
//assending according to key
package Collection;
import java.util.*;
 
public class TreeMapexample 
{
     
    public static void main(String a[])
    {
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");

        System.out.println(hm);
        //traversing of treemap
        Set<String> keys = hm.keySet();
        for(String key: keys)
        {
            System.out.println("Value of "+key+" is: "+hm.get(key));

         }

        //getting value for the given key from TreeMap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is TreeMap empty? "+hm.isEmpty());
        //remove key from 
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());
    }
}
