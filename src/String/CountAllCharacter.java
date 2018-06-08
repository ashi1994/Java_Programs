package String;
import java.util.*;

class CountAllCharacter
{
	
	public static void main(String...s1)
	{
    Scanner sc=new Scanner(System.in);

        int i,j;
        System.out.println("PLEASE ENTER A STRING");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int len=ch.length;
        
        for(i=0;i<len;i++)
        {
               int counter=0;
               char c=s.charAt(i);
               for(j=0;j<len;j++)
               { 
            	   if(c==ch[j])
            	   {
            		   counter++;
            		   ch[j]='\u0000';
            		   }
            	   }  
          
          if(counter>0) //if you do counter>1 then it will print duplicate only.
             System.out.println(c+"--"+counter);

        }



	}
}