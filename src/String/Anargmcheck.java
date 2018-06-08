package String;

import java.util.Arrays;

public class Anargmcheck {
	
	public static boolean anargmchk(String s1,String s2)
	{ 
		boolean b1=true;
		char c1[]=s1.toLowerCase().toCharArray();
		char c2[]=s2.toLowerCase().toCharArray();
		if(c1.length!=c2.length)
		{
			b1=false;
		}
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			b1=Arrays.equals(c1,c2);
		}
		
		return b1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anargmchk("RAM","MAr"));
	}

}
