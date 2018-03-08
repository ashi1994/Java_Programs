package Array;
class Middlearray
{
	public static void main(String...s)
	{
	  int a[]={-1,5,6,12,4,76,82,2};

          if (a.length %2 ==0)
                {
                  System.out.println(a[a.length /2]);
                  System.out.println(a[(a.length /2)-1]);
                } 
                else 

                {
                  System.out.println(a[(a.length /2)]);
                }
}
	}

