/*
 * If nested class is declared as static, then that nested class is called as static nested class.
 * Static nested classes can contain both static and non-static members.
 * We can access only static members of outer class inside a static nested class.
 * Constructors and methods of nested classes can be overloaded.
*/
package Innerclass;
class StaticInnerclass
{
	static int b=10;
	int a=15;

	static class C
	{
		void run()
		{
			//System.out.print(a);it will show warning
			System.out.print(b);
		}
		
	}

 public static void main(String...s)
 {
   StaticInnerclass.C sc=new StaticInnerclass.C();
   sc.run();

 }
}