package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="i love india";String word="";String sentencerev="";
		String arr[]=s1.split(" ");
		
		for(int i=0;i<=(arr.length)-1;i++)
		{
			word=arr[i];
			String wordrev="";
			for(int j=(word.length())-1;j>=0;j--)
			{
				wordrev=wordrev+word.charAt(j);
			}
			sentencerev=sentencerev+wordrev+wordrev.length()+" ";
		}
		System.out.println(sentencerev);

	}

}
