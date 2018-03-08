package String;

import java.util.HashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String duplicate="hello";
		char ch;
		HashSet hs=new HashSet();
		for(int i=0;i<duplicate.length();i++){
			ch=duplicate.charAt(i);
			hs.add(ch);
		}
		System.out.println(hs);
		for(Object ch1:hs)
			System.out.print(ch1);
		
	}

}
