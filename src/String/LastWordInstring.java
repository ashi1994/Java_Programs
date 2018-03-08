package String;
class LastWordInstring
{
	public static void main(String...s)
	{
	    String s1="THIS IS A BOY";
	    String last=s1.substring(s1.lastIndexOf(" ")+1);
	    System.out.println(last);
	}
}