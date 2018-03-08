package Newfeature;
import java.util.Scanner;  
    class AssertionExample
{  
 public static void main( String args[] )
 {  
  
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter ur age "); //compile simply javac AssertionExample 
    
  int value = scanner.nextInt();//must enable assertion via java -ea AssertionExample,otherwise it take normally,no any exception or error thrown

  assert value>=18:" Not valid"; 

  System.out.println("value is "+value);  
} 
}
