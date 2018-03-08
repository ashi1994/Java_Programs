package Newfeature.Annotation;
class A
{  
	void m()
	{
	System.out.println("hello m..");
	}  
	@Deprecated  
	void n()
	{
	System.out.println("hello n,i am deprected");
	}  
}  
  
class TestAnnotation3
{  
	public static void main(String args[])
	{  
		A a=new A();  
		a.n(); 
	}
	
}