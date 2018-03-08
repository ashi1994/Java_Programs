package Globalvariable;
class A
{
	int a1=22;//global variable,it scope in whole program
	//global variable are defined in method if they not define when it is decleared...

	void show()
	{
      int a1=23;
	System.out.print(a1);
	}

	void show1()
	{
      int a1=24;
	System.out.print(a1);
	}
	public static void main(String...s)
	{


	A a=new A();
	a.show();//priority always goes to local if their is local and global both..
	a.show1();
	}

}