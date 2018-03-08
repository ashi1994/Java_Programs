package Package;
/**
 * The static import feature of Java 5 facilitate the java programmer to access any static member of a class directly. 
 * There is no need to qualify it by the class name. 
 */
import static java.lang.System.*;    
class StaticImportExample
{
  public static void main(String args[])
  {  
   out.println("Hello");//Now no need of System.out  
   out.println("Java");    
 }   
}  
   