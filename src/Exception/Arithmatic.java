package Exception;
class Arithmatic
{
	
public static void main(String...s)
{
	try
	{
	int s1=15/0;
	System.out.println(s1);
	}

	catch(ArithmeticException e)//note if the Base "exception" is in first catch and then arithematic it is erroorr.vice versa true ie no error
  {
         e.printStackTrace();

  }

  catch(Exception e)// note "exception" only also catch all exception but it is overhead and bad programming
  {

         e.printStackTrace();

  }




}

}