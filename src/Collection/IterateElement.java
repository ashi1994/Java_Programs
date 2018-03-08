package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String addelemt[]={"hello","hi","bye"};
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<addelemt.length;i++)
			al.add(addelemt[i]);
		
		ListIterator<String> itr=al.listIterator();
		
		/*
		 * Iterate in forward Direction
		 */
		while(itr.hasNext())
			System.out.println(itr.next());
		
		/*
		 * Iterate in backward Direction
		 */
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
		/*
		 * Iterate using FOR each Loop
		 */
		for(String trav:al)
			System.out.println(trav);
	}

}
