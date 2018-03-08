
public class CountAll {
	public static void main(String...s)
	{
		String s1="ashu123Ashi  ";
		int cv=0,cc=0,cn=0,cs=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				cv++;
			}
			else if(Character.isDigit(ch))
			{
				cn++;
			}
			else if(Character.isWhitespace(ch))
			{
				cs++;
			}
			else
				cc++;
			
		}
		System.out.println("vowel  "+cv);
		System.out.println("consotantt  "+cc);
		System.out.println("space  "+cs);
		System.out.println("digit "+cn);
	}

}
