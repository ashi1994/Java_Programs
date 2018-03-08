package OopsConcept;
/**
 *  Polymorphism refers to any entity which takes many form.
 *  Polymorphism in java refers to any entity whether 
 *  it is an operator or a constructor or any method which takes many forms or can be used for multiple tasks either while compiling or while running a java program.
 * 	Method overloading is performed within class.
 *  In case of method overloading, parameter must be different.
 *  Method overloading is the example of compile time polymorphism.
 *  Return type can be same or different in method overloading
 */

public class PolymorphismByOverloading {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	private void add(String s1,String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismByOverloading po=new PolymorphismByOverloading();
		po.add("hello","java");
		po.add(4, 6776);
	}

}
