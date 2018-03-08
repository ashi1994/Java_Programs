
//it child of vector
//list in first out order(LIFO)
//push(),pop(),search(),peek(),empty()
//pop removed last element
package Collection;
import java.util.*;
class Stackexample
{
	public static void main(String...s)
	{
      Stack s1=new Stack();
      s1.push("a");
      s1.push("b");
      s1.push("c");
      System.out.println(s1);//a,b,c
      System.out.println(s1.search("a"));//3 offset value
      System.out.println(s1.search("b"));//2
      System.out.println(s1.search("d"));//-1
    
    
	}
}