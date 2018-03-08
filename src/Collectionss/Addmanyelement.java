package Collectionss;

import java.util.*;

public class Addmanyelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter element in list that u want to add");
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<str.length;i++)
			str[i]=sc.nextLine();
		
		
		Set<String> li=new HashSet<>();
		for(int i=0;i<str.length;i++)
		{
			li.add(str[i]);
		}
		System.out.println(li);
	
		Iterator<String> it=li.iterator();
		while(it.hasNext())
		{
		  System.out.print(it.next());
		}
		
		sc.close();
	}

}
