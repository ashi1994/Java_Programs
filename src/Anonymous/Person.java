/*
A class that have no name is known as anonyomys inner class in java.
it should used when you have to override method class or interfacee.
When you are creating an anonymous inner class, you are actually creating a sub class to a class which needs to be modified. 
This sub class doesn’t have name and it is declared in another class. 
That’s why it is called Anonymous Inner Class.
*/
package Anonymous;
abstract class Person
{
	abstract void eat();
}
  class Testanonyms//outer class
  {
	  public static void main(String...s)
	  {
		  Person p=new Person()
		  {
			  void eat()
			  {
				  System.out.println("nice fruit");
			  }
		  };
		  p.eat();
      }
}

 