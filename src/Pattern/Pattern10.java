package Pattern;
class Pattern10
{
	public static void main(String...s)

{
	for(int i=1;i<=5;i++)
	{
	   for(int j=5;j>=1;j--)

	   {

	     if(i==j)
	     
	     System.out.print("*");
           
          else
          
         System.out.print(j);
	   }
	   System.out.println();
	}


	}

}

/*

5432*
543*1
54*21
5*321
*4321

*/