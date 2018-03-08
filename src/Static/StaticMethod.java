package Static;
/**
 * A static method can be invoked without the need for creating an instance of a class.
 * The static method can not use non static data member or call non-static method directly.
 * this and super cannot be used in static context.
 */
class StaticMethod {

	static void display() 
	{
		System.out.println("i am static method not need of object to call me");
		
	}
      public static void main(String[] args) {
    	  StaticMethod.display();//1
    	  display();//2
    	  
      }
      
}