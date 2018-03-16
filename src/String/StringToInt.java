package String;
class StringToInt
   {
 public static void main(String args[])
   {
 
 //To convert a srting into a int, use:
 String str = "1234";
int i = Integer.parseInt(str);
 System.out.println("i: " + i);
 
 //To convert a number into a string, use:
int num = 1234;   
String str1 = String.valueOf(num);
System.out.println(str1);

//to convert primitive to string
int a=10;
String str2=Integer.toString(a);
System.out.println(str2+10);
}}