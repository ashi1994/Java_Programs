package Searching;
import java.util.*;
class ReverseViaCollection
{
	public static void main(String...s)
	{

	  List<String> li=new ArrayList<>();//<>it is also called as diamond operator
	  li.add("ram");
	  li.add("shyam");
	  li.add("sita");
	  Collections.reverse(li);
	  Iterator itr=li.iterator();

	  while(itr.hasNext())
	  System.out.println(itr.next());


	}


}