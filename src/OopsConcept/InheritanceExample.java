package OopsConcept;

public class InheritanceExample {

	public void print() {
		System.out.println("hello java from papa");
	}
}
class child extends InheritanceExample {
	public void show() {
		System.out.println("i am from child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * creating object of child class
		 */
		child ch=new child();
		ch.print();
		ch.show();
		
		/**
		 * Creating object of child by using reference of parent(i.e upcasting)
		 */
		InheritanceExample inc=new child();//upcasting
	    inc.print();
	    //inc.show();it will not work
	    
	    /**
	     * Creating object of paret
	     */
		
		InheritanceExample in=new InheritanceExample();
		in.print();
		//in.show()//it will not work
		
		/**
		 * 
		 * Downcasting is not directly possible in Java.
		 * we can do upcasting and then we can use that variable for downcasting as below
		 */
		InheritanceExample inc1=new child();//upcasting
		child c=(child) inc1;//downcasting
		c.print();
		c.show();
		
		/**
		 * Exceptional case
		 */
		
		//child ch=new InheritanceExample(); not possible,it will throw type mismatch error
		
		
		
		

	}

}
