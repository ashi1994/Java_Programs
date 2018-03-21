package Array;

public class Maxmininarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,44,12,23,77};
		
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		else if(min>a[i])
				min=a[i];
		}
        System.out.println(max);
     	System.out.println(min);

	}

}
