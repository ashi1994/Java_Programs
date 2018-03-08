//The properties object contains key and value pair both as a string. It is the subclass of Hashtable.
package Collection;
import java.util.*;  
import java.io.*;  
public class Test 
{  
public static void main(String[] args)throws Exception
{  
  
Properties p=System.getProperties();  
Set set=p.entrySet();  
  
Iterator itr=set.iterator();  
while(itr.hasNext())
{  
Map.Entry entry=(Map.Entry)itr.next();  
System.out.println(entry.getKey()+" = "+entry.getValue());  
}  
  
}  
}  