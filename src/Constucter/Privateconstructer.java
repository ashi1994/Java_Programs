package Constucter;
class Privateconstructer
{
	private Privateconstructer()
	{

	System.out.println("hello");
	}

	

public static void main(String...s)
{
	
	new Privateconstructer();
	new Privateconstructer();
}




}