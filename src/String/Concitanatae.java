package String;

public class Concitanatae {
	
	public static String conString(String str1,String str2 ){
		String rev="";
		String finl="";
	
		
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++)	
			rev=rev+str1.charAt(i)+str2.charAt(i);
			finl=finl+rev;
	
		
		}  
		else if(str1.length()>str2.length()){
			for(int i=0;i<str2.length();i++)
			rev=rev+str1.charAt(i)+str2.charAt(i);
			finl=finl+rev+str1.substring(str2.length());
			
		}
		else if(str1.length()<str2.length()){
			for(int i=0;i<str1.length();i++)
			rev=rev+str1.charAt(i)+str2.charAt(i);
			finl=finl+rev+str2.substring(str1.length());
		}
		
		return finl;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(conString("abc", "def"));
		

	}

}
