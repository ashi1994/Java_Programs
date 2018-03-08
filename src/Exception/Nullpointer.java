package Exception;
class Nullpointer
{
	
public static void main(String...s)
{
	try
	{
		String s1=null;
		System.out.println(s1.length());
	}

	catch(NullPointerException e)//note if the Base "exception" is in first catch and then arithematic it is erroorr.vice versa true ie no error
  {
		e.printStackTrace();

  }

 



}

}