package Newfeature;
//The varrags allows the method to accept zero or muliple arguments
class Varargs
{

   static void show(String...a1)
   {
      System.out.println("testing");

   }
   static void show()
   {
      System.out.println("testing");
      
   }
	public static void main(String...s)
	{
       show();
       show();
	}
}