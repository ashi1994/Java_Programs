package String;

import java.util.HashMap;

public class Occuranceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		char s2[]=s1.toCharArray();
		//Creating a HashMap object with elements of inputArray as keys and their count as values
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		//adding element in Hashmap
		for(char c:s2){
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				//If element is not present in hm
				//adding this element to hm with 1 as it's value
				hm.put(c,1);
			}
		}
		System.out.println(hm);
   
	}

}
