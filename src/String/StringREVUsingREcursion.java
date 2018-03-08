package String;

public class StringREVUsingREcursion {
	
	    public static String reverse(String rev)
	    {
	        
	        if(rev.isEmpty())
	            return rev;
	        else
	            return reverse(rev.substring(1))+rev.charAt(0);
	     }
	    
	    public static void main(String args[]) 
	    {
	       System.out.println(reverse("hello"));
	    }
	}
