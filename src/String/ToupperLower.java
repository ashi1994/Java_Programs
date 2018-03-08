package String;
import java.util.*;
class ToupperLower
{
	public static void main(String...aas)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTR A String");
		 String s1=sc.nextLine();

String s2=s1.toLowerCase();
System.out.println(s2);


String s="Sachin";  
System.out.println(s.toUpperCase());//SACHIN  
System.out.println(s.toLowerCase());//sachin  
System.out.println(s);//Sachin(no change in original)  
}

}