package String;
class Methods
{
	public static void main(String...s)
	{

String s1="Hello";
String s2="Oelo";
String s3="Hello";
String s4="Ashiwani Ranjan";
String s5="Hello";
String s6="  i love india  ";
String s7="";

char ch=s1.charAt(3);//java string charAt() method returns a char value at the given index number
System.out.println(ch);

System.out.println(s1==s3);//print true
System.out.println(s1.compareTo(s2));//The java string compareTo() method compares the given string with current string lexicographically. 
System.out.println(s1.compareTo(s3));//It returns positive number, negative number or 0.

System.out.println(s1.concat(" India"));//The java string concat() method combines specified string at the end of this string.//Hello India
System.out.println(s4.concat("is good boy"));//Ashiwani Ranjanis good boy

System.out.println(s4.contains("Ranjan"));//The java string contains() method searches the sequence of characters in this string.//true
System.out.println(s1.contains("India"));//It returns true if sequence of char values are found in this string otherwise returns false.//false


System.out.println(s1.startsWith("Hel"));//The java string startsWith() method checks if this string starts with given prefix.//true false return karega

System.out.println(s1.endsWith("o"));//The java string endsWith() method checks if this string ends with given suffix.//true
System.out.println(s4.endsWith("ashi"));//It returns true if this string ends with given suffix else returns false.//false


System.out.println(s1.equals(s5));//The java string equals() method compares the two given strings based on the content of the string. //true
System.out.println(s1.equals(s2));//If any character is not matched, it returns false. If all characters are matched, it returns true.//false


System.out.println(s6);//  i  love india  //The java string trim() method eliminates leading and trailing spaces.
System.out.println(s6.trim());//i love india



System.out.println(s1.length());//The java string length() method length of the string. //5



System.out.println(s2.replace('L','H'));//The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
System.out.println(s4.replace("Ranjan","Rajput"));//replace(CharSequence target, CharSequence replacement)


System.out.println(s1.replaceAll("l","m"));//The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.//Hemmo

System.out.println(s7.isEmpty());//The java string isEmpty() method checks if this string is empty.//true
System.out.println(s1.isEmpty());//false


String joinString1=String.join("-","welcome","to","javatpoint");//The java string join() method returns a string joined with given delimiter.
System.out.println(joinString1);


}
}
