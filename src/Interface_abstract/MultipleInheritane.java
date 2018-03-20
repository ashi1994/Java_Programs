package Interface_abstract;
interface Printable {
	void show();
	}  
  
interface Showable {
	void show();  
	}  
  
class MultipleInheritane implements Printable,Showable{  
	public void show() 
	{
		System.out.println("Welcome");
		
	}  

  
public static void main(String args[])
{  
	MultipleInheritane obj = new MultipleInheritane();
	//Printable obj = new MultipleInheritane(); 
	//Showable obj = new MultipleInheritane();  
	obj.show();  
 }  
} 

/*
 * This is perfectly fine because the interfaces are only declaring the methods and 
 * the actual implementation will be done by concrete classes implementing the interfaces.
 *  So there is no possibility of any kind of ambiguity in multiple inheritance in java interfaces.
 * 
 */


