package Collection;
import java.util.ArrayList;

public class ArrayListAddDelete {
	
	public static void main(String...s) {
		ArrayList<String> li=new ArrayList<String>();
		li.add("hello");
		li.add("selenium");
		li.add("team");
		for(int i=0;i<li.size();i++) {
			System.out.println("elements are "+li.get(i));
		}
		
		System.out.println("Now Removing The Element");
		li.remove(2);
		li.remove("hello");
		
		for(int i=0;i<li.size();i++) {
			System.out.println("elements are "+li.get(i));
		}
	}

}
