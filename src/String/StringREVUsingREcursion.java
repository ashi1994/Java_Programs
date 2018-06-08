package String;

import java.util.Scanner;

public class StringREVUsingREcursion {
	
	    public static String reverse(String rev){
	        
	        if(rev.isEmpty())
	            return rev;
	        else
	            return reverse(rev.substring(1))+rev.charAt(0);
	     }
	    
	    public static void main(String args[]) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	String input=sc.nextLine();
	    	
	       System.out.println(reverse(input));
	    }
	}
