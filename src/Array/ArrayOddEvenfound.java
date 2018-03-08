package Array;
class ArrayOddEvenfound
{
	
	public static void main(String...s)
	{
            
		
       int arr[]={1,3,8,12,67,88};
       System.out.println("even no's are: ");

       for(int i=0;i<arr.length;i++)
         { 
       	if(arr[i]%2==0)
           
       		System.out.println(arr[i]);
          }
       System.out.println("odd no's are: ");

       for(int i=0;i<arr.length;i++)
       { 
             if(arr[i]%2!=0)
           
                  System.out.println(arr[i]);
       }
	  for(int i=0; i<arr.length; i++)
        {
          
           boolean isPrime = true;
        //check to see if the numbers are prime
        for (int j=2; j<i; j++)
        {

            if(i%j==0)
            {
                isPrime = false;
                break;
            }
        }
        //print the number
        if(isPrime)
             System.out.println(i);
 }



      }
}