package Constucter;
class A
{
	
	public A(int a)
	{
   System.out.println("hello from simple construtrr");

	}

	A(int a,int b)

	{
	int c=a+b;
	System.out.println(c);

	}

public static void main(String...s)
{
	
	new A(1);//arguement required if we give own constructer if not then ERROR
	new A(10,20);
}
}