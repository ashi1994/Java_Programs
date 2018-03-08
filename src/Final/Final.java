
package Final;


/*
class Main {
   public static void main(String args[]){
	// The following doesn't compile because final variable is assigned  value twice.
      final int i = 20;
      i = 30;  
   }
}
*/


//Error in following program as we are trying to extend a final class
/*
final class Base 
{ 
    }
class Derived extends Base { }
  
public class Main {
   public static void main(String args[]) {
   }
}
*/

//  ERROR IN FOLLOWING PROGRAM DUE TO FINAL METHOD NOT OVERRIDE...
/*
class Base 
{
  public final void show() 
  {
       System.out.println("Base called");
    }
}
 
class Derived extends Base {
    public void show()//Error due to final method not override
     {  
       System.out.println("Derivedalled");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}
*/