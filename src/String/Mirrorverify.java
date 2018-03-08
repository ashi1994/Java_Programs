package String;

public class Mirrorverify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="";
		String rev="";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=s1.length()-1;j>0;j--)
			{	
			if(s1.charAt(i)==s1.charAt(j))
			{
				
			}
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);

	}

	}
}
