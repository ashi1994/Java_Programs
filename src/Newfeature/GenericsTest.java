package Newfeature;

import java.util.ArrayList;

public class GenericsTest {

	public static void main(String[] args) {
		
		/*
		 * Benefits of Generics
		 * We can hold only a single type of objects in generics. It doesn’t allow to store other objects.
		 * Type casting is not required
		 * Compile-Time Checking
		 */
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("Heloo");
		//li.add(1) It will show error on Compile time
		
		/*
		 *Problem without Generics 
		 */
		ArrayList lm=new ArrayList();
		li.add("ram");
		String s = (String) lm.get(0);//typecasting
		
		

	}

}
