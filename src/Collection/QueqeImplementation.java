package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueqeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		PriorityQueue<String> p=new PriorityQueue<>();
		p.add("one");//it will return true when addition goes successful
		p.add("two");
		p.add("three");
		p.add("four");		
		
		System.out.println(p.offer("five"));//it is also used for add the element
		
		Iterator<String> it=p.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		/*Retrive element at head*/
		System.out.println(p.element());
		
		/*Retrive element at head return null if queue is empty*/
		System.out.println(p.peek());
		
		/*Retrive element at head and remove, return null if queue is empty*/
		System.out.println(p.poll());
		
		/*Retrive element at head and remove*/
		System.out.println(p.remove());
		
		/**/
		
		
	}

}
