package Block;
class BlockExecution
{
	{
	   System.out.println("hello init block");
	}
	static
	{
      System.out.println("hello Static block");

	}
	BlockExecution()
	{
       System.out.println("consructer");


	}
	public static void main(String...s)
	{

    new BlockExecution();
    new BlockExecution();//every time init block invoked when we create object or call constructer
	}




}