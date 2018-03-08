//The Java throws keyword is used to declare an exception.
//Checked exception can be propagated with throws.
//  Throws is used with the method signature.
package Exception;
class TestThrows
{
 static void check() throws ArithmeticException
 {
  System.out.println("Inside check function");
  throw new ArithmeticException("demo");
 }

 public static void main(String args[])
 {
  try
  {
   check();
  }
  catch(ArithmeticException e)
  {
   System.out.println("caught" + e);
  }
 }
}