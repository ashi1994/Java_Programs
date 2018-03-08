/**
 * Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods
 *  or fields to indicate some additional information which can be used by java compiler and JVM.
 *  Prevoiusly we are using Xml for Metadata
 */
package Newfeature.Annotation;
class Animal
{  
	void eatSomething()
	{
	System.out.println("eating something");
	}  
}	
	class Dog extends Animal{  
		@Override  
		void eatSomething()//if you write ur overrided method wrong(like eatsomething) then it show compile time error
		{
			System.out.println("eating foods");
			
		}
	}
		class TestAnnotation1
		{  
			public static void main(String args[]){  
		
			Animal a=new Dog();  
			a.eatSomething();  
			
			
			}
			}  