package String;
public class SplitExample
{  
public static void main(String args[])
{  
String s1="java string split method by javatpoint";

String[] words=s1.split(" ");//splits the string based on string


for(int i=0;i<words.length;i++)
{
	System.out.println(words[i]);
}
//using java foreach loop to print elements of string array  
/*
for(String w:words)
{  
System.out.println(w);  
}  
*/
}

}