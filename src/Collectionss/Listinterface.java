package Collectionss;
import java.util.*;  

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		  List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ajay");
		  al.add(1,"rahi");//add at specified element
		  al.set(2, "ashi");//set will replace specfied element 
		    
		  List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("teghj");    
		  al2.add("Juna");
		  al2.remove("James");//remove the specfied element
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);
		  
		  System.out.println(al2.get(2));//get element at specfied index
		  System.out.println(al2.indexOf("Sgygyi"));//get index of specfied object
		  
		  //it clear the all element of specfied collection
		  al2.clear();
		  System.out.println(al2);
		  
		  /*
		  Iterator itr=al.iterator();//iterator interface through iterate
		  while(itr.hasNext())
			  System.out.println(itr.next());
		  */
		  
		  
		  /*
		  for(String s1:al)//for each loop iterate
			  System.out.println(s1);
		  */
		  System.out.printf("%d",3);//% can be used in java using "%d" like C.
		  
		  System.out.println(al.equals(al2));//compare two list 

		  Collections.sort(al);//sort used for sort element in collection
		  System.out.println(al);
		  
		  Collections.reverse(al2);//reverse element of collection
		  System.out.println(al2);
		  
		  //Iterating in backward direction 
		  ListIterator<String> lit=al.listIterator();
		  while(lit.hasPrevious())
			  System.out.println(lit.previous());
		  
	}

}
