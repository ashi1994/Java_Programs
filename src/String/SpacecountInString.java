package String;
class SpacecountInString
{
	public static void main(String...s)
	{

	   String str="HELLO  JAVA";
	   int spaceCount = 0;
      for (char c : str.toCharArray())
   {
    if (c == ' ') 
    {
         spaceCount++;
    }
}
System.out.println(spaceCount);
	}
}