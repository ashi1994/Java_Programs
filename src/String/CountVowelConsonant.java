package String;
//.write a program to count no. of vowel,consonant,digit and whitespace in a string.
import java.util.*;
class Count
{
public static void main(String args[])
 {
 Scanner a=new Scanner(System.in);
System.out.println("enetr the string");
String str=a.nextLine();
str=str.toLowerCase();

int vowel=0;
int consonant=0;
int digit=0;
int blankspace=0;
for (int i = 0; i < str.length(); i++)
 {
   char c = str.charAt(i);
   if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
  
         vowel++;
  
   
      else if(Character.isDigit(c))
        
        digit++;
      else if(Character.isWhitespace(c))
        blankspace ++;
      else
        consonant++;

  }
  System.out.println("no of vowels is " +vowel);
 System.out.println("no of consonant is :" +consonant);
 System.out.println("no of digit is :" +digit);
 System.out.println("no of space is :" +blankspace);
}
}