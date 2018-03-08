package String;

public class Staticoveride {

	static void show()
	{
		System.out.println("helo");
	}
}

class A extends Staticoveride
{
	static void show()
	{
		System.out.println("huhi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       show();
	}

}
