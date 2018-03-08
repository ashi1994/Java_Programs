package Array;
class ArrayContainNo
{
	
	public static void main(String...s)
	{
	          int a[]={1,6,11,9,10};
	          int n=10;
	          boolean present=false;
	          for(int i=0;i<a.length;i++)
	          {
                     if(a[i]==n){
                    	 present=true;
                    	 break;
                     }
	          }
	          if(present)
                    System.out.println("Found");
	          else
                	System.out.println("Not found");

	          }


    }
