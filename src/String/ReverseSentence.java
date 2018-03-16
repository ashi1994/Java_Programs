package String;
class ReverseSentence
{
	public static void main(String...s)
	{

	  String s1="i love my india";
	  String s2[]=s1.split(" ");
	  
	  for(int i=s2.length-1;i>=0;i--)
	  {

         System.out.print(s2[i]+" ");
}
	}

}

//india my love i