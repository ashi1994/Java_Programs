package String;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String a="i love india";
		String a1[]=a.split(" ");
		String rev="";
		for(int i=0;i<a1.length;i++)
		{
			String word=a1[i];
			String wordrev="";
			for(int j=word.length()-1;j>=0;j--)
	
			{
				wordrev=wordrev+word.charAt(j);
			}
			rev=rev+wordrev+" ";
		}
		System.out.println(rev);
	}

}
