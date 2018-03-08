package Io;
import java.io.*;  
class A
{  
public static void main(String args[])
{  
  
Console c=System.console();  
  
System.out.println("Enter your name");  
String n=c.readLine();  
 
  System.out.println("Enter password");  
char[] ch=c.readPassword();  
 System.out.println("Welcome "+n); 
System.out.println("Password is");  
for(char ch2:ch)  
System.out.print(ch2);  

}
}
