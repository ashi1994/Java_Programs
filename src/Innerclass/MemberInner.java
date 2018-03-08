/**
A non-static class that is created inside a class But outside a method is called member inner class.
Non-static nested classes (inner classes) has access to all members(static and non-static variables and methods, including private)
of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.
*/
package Innerclass;
class MemberInner
{
	private int a=10;
	class Inner
	{
		void show()
		{
			System.out.println(a);
		}
	}
	public static void main(String...s)
	{
		MemberInner a2=new MemberInner();  
        MemberInner.Inner in=a2.new Inner();
        in.show();  
         


	}

}