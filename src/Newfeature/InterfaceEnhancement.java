package Newfeature;

interface test {
	void show();
	static void print() {
		System.out.println("Hi i am new feature in JAVA 8");
	}
	default void copy() {
		System.out.println("i am second featue in java 8");
	}
	/*
	 private void show1() {
	 System.out.println("i am new featue in JAVA 9");
	 */
	
}

public class InterfaceEnhancement implements test {
	public void show() {
		System.out.println("i am implementes method");
	}
	public static void  main(String...s1) {
		test obj=new InterfaceEnhancement();
		obj.copy();
		test.print();
		obj.show();
		
	}
}
/**
    default void say() {  
        saySomething();  
    }  
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
}  
public class PrivateInterface implements Sayable {  
    public static void main(String[] args) {  
        Sayable s = new PrivateInterface();  
        s.say();  
    }  
}
*/ 
