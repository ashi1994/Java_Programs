package String;
class LengthString
{
	
public static void main(String...s)
{
String blah = "Hello";
int count = 0;
for(char c : blah.toCharArray())

{
     count++;
}
System.out.println("blah's length: " + count);
}
}