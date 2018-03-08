package Exceptionhandle;

public class Printstacktace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10/0;
			String s=null;
			System.out.println(s.length());
		}
		
	
		catch(NullPointerException |  ArithmeticException e)
		{
			e.printStackTrace();//it give exact information about exception with location
			
			//System.out.println(e);//it will give only information about exception
		}
		
		catch(Exception e1)//always most specific to parent otherwise it create issue
		{
			System.out.println(e1);
		}

		
		
		finally
		{
			System.out.println("i always executed");
		}
		
		System.exit(0);
		
		
		
	}

}
