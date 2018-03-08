import java.text.*;
import java.util.*;
public class Sortdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Date> listDates = new ArrayList<Date>();
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		 
		try 
		{
			
		    listDates.add(dateFormatter.parse("30-03-2017"));
		    listDates.add(dateFormatter.parse("2013-07-06"));
		    listDates.add(dateFormatter.parse("2013-11-28"));
		}
		catch (ParseException ex)
		{
		    System.err.print(ex);
		}
		 
		System.out.println("Before sorting: " + listDates);
		 
		Collections.sort(listDates);
		 
		System.out.println("After sorting: " + listDates);

	}

}
