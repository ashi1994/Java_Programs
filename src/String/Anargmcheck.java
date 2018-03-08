package String;

import java.util.Arrays;

public class Anargmcheck {
	
	public static boolean anargmchk(String s1,String s2)
	{ 
		boolean b1=false;
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(c1.length==c2.length)
		{
		  b1 =true;
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		b1=c1.equals(c2);
		return b1;
		}
		else
			
			b1=false;
		return b1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anargmchk("aaa","bbb"));
	}

}
