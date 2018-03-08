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