package String;
/*
 * In java strings are object and string is a class also.
 * String is immutable in java.
 */

public class CreateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By using Character array
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		//String Literal
		String s1="hello javva";
		System.out.println(s1);
		
		//By new Keyword
		String str=new String("java");
		System.out.println(str);
		

	}

}
