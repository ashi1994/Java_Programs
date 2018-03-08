package String;
public class StringToCharArray
 {  
public static void main(String args[])
 {  
String s1="hello";  
char[] ch=s1.toCharArray();//convert string into thev array  
for(int i=0;i<ch.length;i++)
{  
System.out.print(ch[i]+" ");  
}  
}}