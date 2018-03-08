package Newfeature.Annotation;
import java.util.*;  
class TestAnnotation2
{  
	@SuppressWarnings("unchecked")  
	public static void main(String args[])
	{  
		ArrayList list=new ArrayList();//here arraylist is unchecked type means u not declered that as any particular data type link string or integert  list.add("sonoo"); 
		list.add("vimal");  
		list.add("ratan");  
		for(Object obj:list)
			System.out.println(obj); 
		
	}
}  