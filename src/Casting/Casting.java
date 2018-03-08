package Casting;
class Casting
{
	public static void main(String...s)
{

Object foo = "something";//String.valueOf(foo) invokes foo's .toString() method, creates a String out of it and assigns it to the the bar.
String bar = String.valueOf(foo);//creates a String out of it and assigns it to the the bar.
System.out.println(bar);
Object foo1 = "something";//Casting will just assign foo to the bar, 
String bar1 = (String) foo1;//since the types are matching. Otherwise, the expression would throw a ClassCastException.
System.out.println(bar1);

}
}