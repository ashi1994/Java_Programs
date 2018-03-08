package Array;
class Arraysize
{
	
	public static void main(String...s)
	{
         int a[]={1,88,6,8,2};
         //By using any inbuild function
         int count=0;
         for(int ar:a)
        	 count++;
         System.out.println("Length is "+count);
         //by using function(property)
         int a1=a.length;
        System.out.println(a1);

	}
}