
public class Testarray {
	
	static void arraysort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				
			System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]={1,3,4};

		arraysort(b);
	}

}
