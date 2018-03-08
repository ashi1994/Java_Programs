package String;
import java.util.*;
class RemoveDuplicateCharacter
{
	public static void main(String...s)
	{

	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	int l = s1.length();
        char ch;
        String ans="";
         
        for(int i=0; i<l; i++)
        {
            ch = s1.charAt(i);
            if(ch!=' ')

                ans = ans + ch;
            
            s1 = s1.replace(ch,' '); 
        }
 
       System.out.println("Word after removing duplicate characters : " + ans);

	}



}