package String;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abca";
		String rev="";
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				if(!(arr[i]==arr[j]))
				{
					rev=rev+s1.charAt(i);
					
				}
			}
			
		}
       System.out.println(rev);
     
	}

}
