package Exception;
class Finally
{
	public static void main(String...s)

{
	try
	{
		int[] a={1,3,4};
        System.out.println(a[3]);//array out of bound exception
    }

	catch(NullPointerException |ArithmeticException |ArrayIndexOutOfBoundsException  e)//multiple exception in single catch from java 7
   {
   	System.out.println(e);///means sabse pahle higher ni ie "EXCEPTION" not in first caught
   }
    finally//exception caught or not it always excuted...
   {
     System.out.println("Exception AAYE YA N AAYE MAI CHALUNGA");
   }

}
}