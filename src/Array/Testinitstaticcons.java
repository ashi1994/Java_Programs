package Array;

public class Testinitstaticcons {
	
	static
	{
		System.out.println("hello static");
	}

	{
		System.out.println("hello init block");
	}
	
	Testinitstaticcons()
	{
		System.out.println("hello constructetr");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Testinitstaticcons();
		new Testinitstaticcons();

	}

}
