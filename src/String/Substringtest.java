package String;
public class Substringtest
{  
 public static void main(String args[])
 {  
   String s="Sachin Tendulkar"; 
   System.out.println(s.length());//16s

   System.out.println(s.substring(4));//in Tendulkar//isme us string ko v lete huye print karega
     
  System.out.println(s.substring(1,6));//achin//isme uske bich wale ko print karegra bad wala include ni hoga
  System.out.println(s.substring(16));//it will return empty String.
  System.out.println(s.substring(6,6));//it will return empty String.
  System.out.println(s.substring(16,2));//It will only throw StringIndexBoundException when beginIndex is negative, larger than endIndex or larger than length of String.


 }  
}  