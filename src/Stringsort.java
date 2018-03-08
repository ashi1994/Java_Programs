
public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp="";
		String s1[]={"ram","shyam","mohan"};
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}

	}

}
