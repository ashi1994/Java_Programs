package String;
class CountLowerupper
{
	public static void main(String...s)
	{
	 int lowercase=0;
	 int uppercase=0;
	  String s2="Hello Java";
	  for(int i=0;i<s2.length();i++)
	  {
	  char c=s2.charAt(i);

	 if (Character.isUpperCase(c)) 
	 uppercase++;

    // Check for lowercase letters.
   else if (Character.isLowerCase(c))
     lowercase++;
}
System.out.println("no of uppercase is " +uppercase);
 System.out.println("no of lowercase is :" +lowercase);

	}
}