//It can be used to return string from pool memory, if it is created by new keyword 
package String;
public class InternMethod
{  
public static void main(String args[])
{  
String s1=new String("hello");  
String s2="hello";  
String s3=s1.intern();//returns string from pool, now it will be same as s2  
System.out.println(s1==s2);//false because reference is different  
System.out.println(s2==s3);//true because reference is same  
}}


/*intern() method of java.lang.String class is used to perform interning i.e 
creating an exact copy of heap string object in string constant pool
Benefits--
To Save The memory Space 
For Faster Comparison
*/

