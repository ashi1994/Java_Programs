    import java.text.SimpleDateFormat;  
	import java.util.Date; 
	
	public class DateTimeCheck
	{  
	public static void main(String[] args)
	{  
		//for formatted date format
	    Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss ");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate);  
	    
	    //for simple date
	    
	    Date dt=new Date();
	    System.out.println(dt);
	    System.err.println("error message");  
	}  
	} 

