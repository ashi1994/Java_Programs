package String;
class ComparingReference
{
 public static void main(String args[])
 {
 
   String str1 = "c4learn.com";
   String str2 = "c4learn.com";
   String str3 = new String("c4learn.com");
   String str4 = new String("c4learn.com");

   System.out.println(str1 == str2);//true
   System.out.println(str1 == str3);//false
   System.out.println(str3 == str4);//false
   
 }
}
/*
System.out.println(str1 == str2);
str1 and str2 both are referring the same object. Which makes str1 and str2 equal. While in case of 2nd line –

System.out.println(str1 == str3);
Though content of str1 and str3 is same, instance of str3 is not same as that of str1. str3 refers to the instance that is created in the non-pool / heap.
*/