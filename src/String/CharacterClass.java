package String;

public class CharacterClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="i love India    20113";
		char c;
		int digit=0;
		int lc=0;
		int uc=0;
		int space=0;
		for(int i=0;i<s1.length();i++){
			c=s1.charAt(i);
	
		if(Character.isDigit(c)) {
			digit++;
		}
		else if(Character.isLowerCase(c))
			lc++;
		else if(Character.isUpperCase(c))
			uc++;
		else if(Character.isWhitespace(c))
			space++;
	}
		System.out.println("number of digit ="+digit);
		System.out.println("number of lower character ="+lc);
		System.out.println("number of upper character ="+uc);
		System.out.println("number of space ="+space);

	}
}
