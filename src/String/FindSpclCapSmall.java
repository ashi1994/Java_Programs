package String;
import java.util.*;

class FindnoString
{
 public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter the string");
   String str=s.nextLine();
   int count=0,num=0,sp=0,sd=0;
   int len=str.length();
   for(int j=0;j<len;j++)
    {
       char c=str.charAt(j);
   for(char i=65;i<90;i++)
   {
   
      if(c==i)
       {
        count++;
       }
   }
    for(char i=97;i<=122;i++)
     {
   
      if(c==i)
       {
        num++;
       } 
     }
     if(c==(char)32)
     {
       sp++;
     }
     for(char i=55;i<=64;i++)
     {
   
      if(c==i)
       {
        sd++;
       } 
     }
  }
    System.out.println("Capital charactor="+count);
    System.out.println("small charactor  ="+num);
    System.out.println("spaces corector="+sp);
    System.out.println("special corector="+sd);
    System.out.println("total charector="+len);

  }
 }
