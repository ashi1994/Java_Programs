package String;
class Stringempty
{
	public static void main(String...s)
	{
	String s1=null;
	String s2="";

	System.out.println(s1);//it will print null
	System.out.println(s2);//it will print nothing
	System.out.println(s2.length());//it will print zero,one,two depend on spacing
	System.out.println(s1.length());//it will throw runtime exception(null pointer exception)
	}
}