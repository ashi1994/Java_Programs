//SORTING USING COLLECTION
// FOR STRING OBJECT
package Collection.Sorting;
import java.util.*;  
class TestSort1{  
public static void main(String args[])
{  
  
ArrayList<String> a=new ArrayList<String>(); 

a.add("Viru");  
a.add("Saurav");  
a.add("Mukesh");  
a.add("Tahir");  
Collections.sort(a);//for sort
Iterator itr=a.iterator();  
while(itr.hasNext())

System.out.println(itr.next()); 


   
System.out.println("after reverse");

 Collections.reverse(a);//for  reverse
Iterator itr1=a.iterator();  
while(itr1.hasNext())

System.out.println(itr1.next()); 


}  
}