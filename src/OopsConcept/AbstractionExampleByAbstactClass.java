package OopsConcept;
/**
 * Abstact class can not initiated and it may have Constructer
 * Abstraction is used to separate ideas from their implementation
 * Abstraction in java is used to define only ideas in one class so that the idea can be implemented by its sub classes according to their requirements.
 *
 */
abstract class A  {
	
	abstract void show();//no body only declartion
	
	public void print() { //normal method
		System.out.println("i am normal method");
	}
	
	A() {    //constructer
		System.out.println("i am constructer");
	}
}
class AbstractionExampleByAbstactClass extends A {
	public void show() {
		System.out.println("i am abstact method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A abs=new AbstractionExampleByAbstactClass();
		abs.show();
		abs.print();

	}

}
/*
i am construcyer
i am abstact method
i am normal method
*/