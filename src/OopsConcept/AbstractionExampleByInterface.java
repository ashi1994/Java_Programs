package OopsConcept;
/**
 * It has static constants and abstract methods.
 * An interface in java is a blueprint of a class
 * The java compiler adds public and abstract keywords before the interface method.
 * More, it adds public, static and final keywords before data members.
 * No Constructer is allowed
 * No blocks are allowed inside the
 * @author aranjan
 *
 */
interface b {
	 void show();//compliler add like public abstract void show()
	 int data=10;//compliler treated this as public static final int data=10;
}
class AbstractionExampleByInterface implements b {
	public void show() {
		System.out.println("i am interface method");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	b obj=new AbstractionExampleByInterface();
	obj.show();
	
		
	}

}
