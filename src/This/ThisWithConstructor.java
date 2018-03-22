package This;
class ThisWithConstructor
{
	ThisWithConstructor()
   {
		System.out.println("Hi i am default constructer");
		
   }
	ThisWithConstructor(String s1) {
		this();//it will invoke default constructer
		System.out.println("hello my name is "+s1);
	}
  
public static void main(String...s)
{
	new ThisWithConstructor("ashiwani");
	
}
}