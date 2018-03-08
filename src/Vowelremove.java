
public class Vowelremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="hellooo";
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
        	char ch=s1.charAt(i);
        	if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
        	{
        		s2=s2+ch;
        	}
        }
        System.out.println(s2);
   
	}

}
