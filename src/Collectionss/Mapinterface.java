package Collectionss;

import java.util.*;


public class Mapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> mp=new HashMap<Integer,String>();
		//Map<Integer, String> mp=new Hashtable<Integer,String>(); Hashtable never store null value
		//it will show null pointer exception 
		mp.put(1,"heloo");
		mp.put(2,"java");
		mp.put(5, "hi");
		mp.put(3, "ram");
		mp.put(0, null);
		System.out.println(mp);
		
		
		System.out.println(mp.get(4));//if element at specified index
		
		System.out.println(mp.isEmpty());//it check existence of element in map and return true false
		
		System.out.println(mp.remove(0));//it remove the specfied key from map
		
		System.out.println(mp.size());//it return size of collection(map)i.e number of (key,value) pair present in that collection 
		
		System.out.println(mp.hashCode());//it will print hashcode of that map
		
		System.out.println(mp.replace(2, "kava"));//it will replace the element at specified index
		
		System.out.println("Iterating or looping map using java foreach loop");
		
		//iterating the map using forEach loop
		for(int key : mp.keySet())
		   System.out.println("key: " + key + " value: " + mp.get(key));
	
		
	  }

}
