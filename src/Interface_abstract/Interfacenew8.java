package Interface_abstract;

interface a1
{
	void play();

	default void show()//new method in which give body with function in java 8
  {
	System.out.println("new defauit mehod with body call");
  }

}
class Hello1 implements a1
{
	public void play()
	{
	System.out.println("normal mehod without body call");
	}
	
public static void main(String...s)
{
	a1 h=new Hello1();
	h.play();
	h.show();
}
}
/**
 * From Java 9 NOW
Constant variables--in java 7
Abstract methods--in java 7
Default methods--in java 8
Static methods--in java 8
Private methods--in Java 9
Private Static methods--in java 9
 * 
*/