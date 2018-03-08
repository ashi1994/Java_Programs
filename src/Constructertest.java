
public class Constructertest
{
	Constructertest()
	{
		System.out.println("hello");
	}
	
	Constructertest(int a)
	{
		this();
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructertest(10);

	}

}
