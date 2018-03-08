package Array;
class MissingInArray
{
	public static void main(String...s)
	{
      int a[]={1,2,3,4,5,6,7,9,10};
	  int sum=0,asum=0;
	for(int i=1;i<=10;i++) 
		sum=sum+i;
	for(int i=0;i<a.length;i++)
      asum=asum+a[i];
int misno=sum-asum;//it will find a single missing number in sorted consecutive array
System.out.println("misssing no." +misno);
}
    }