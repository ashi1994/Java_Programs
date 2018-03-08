package String;
class ComparingContent
{
 public static void main(String args[])
 {
 
   String str1="c4learn.com";
   String str2="c4learn.com";
   String str3="C4LEARN.com";
   String str4=new String("c4learn.com");
   String str5=str4;//if we assign a string to another it give same result in both equlas and == i.e true
   String str6=str3;

   System.out.println(str1.equals(str2));//true
   System.out.println(str1.equals(str3));//false
   System.out.println(str2.equalsIgnoreCase(str3));//true
   System.out.println(str1.equals(str4));//true
   System.out.println(str5.equals(str4));//true
   System.out.println(str5==str4);//true
   System.out.println(str6==str3);//true
   System.out.println(str6.equals(str3));//true

   
 }
}