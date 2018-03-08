/**
 * When you are creating an anonymous inner class, you are actually creating a sub class to a class which needs to be modified.
 * This sub class doesn’t have name and it is declared in another class. 
 * That’s why it is called Anonymous Inner Class.
 */
package Innerclass;
abstract class Annonyms
{
	abstract void run();
}
	class A2
	{
		public static void main(String...s)
		{   
			Annonyms a=new Annonyms()
			{
				void run()
				{
					System.out.print("helloo");
					
				}
				
			};
			a.run();
			
		}

}