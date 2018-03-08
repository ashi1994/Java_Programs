/**
If the superclass method does not declare an exception,
subclass overridden method cannot declare the checked exception.(only unchecked)
 * If the superclass method declares an exception, subclass overridden method can declare same,
 * subclass exception or no exception but cannot declare parent exception.
 */
package Exception;
class ExceptionOverride
{
	void show()
	{
	System.out.println("hello java");
	}
}
class A5 extends ExceptionOverride
{
	void show() throws ArithmeticException
	{
	 System.out.print("hello exception");
	}

public static void main(String...s)
{
	ExceptionOverride a=new A5();
	a.show();

}
}
