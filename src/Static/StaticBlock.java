package Static;
/**
 * It is executed before main method at the time of classloading.
 * Is used to initialize the static data member.
 * can we execute the program without main method? 
 * Yes, one of the way is static block but in previous version of JDK not in JDK 1.7.
 */
class StaticBlock
{
	 static 
	  {
	    System.out.println("Ye ,Static block is executed before main method.");
	  }
	  
	  {
	    System.out.println("Ye ,init block is executed after main method and before Constructer is called");
	  }
	  
	  StaticBlock()
	  {
	    System.out.println("Constucter is called");
	   }
  public static void main(String[] args) 
  {
	  System.out.println("i am from ,main method");
  	  new StaticBlock();
  	
  }
 
 
}