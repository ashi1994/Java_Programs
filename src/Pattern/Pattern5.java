package Pattern;
class Pattern5
{
	
public static void main(String...s)
	{
		int n=1;

for(int i=1;i<=5;i++)
{
	

	for(int j=5;j>=1;j--)

	{
     /*     
	System.out.print(n+" ");
            n=n+1;
     */
            if(i==j)
            {
            	System.out.print("*");

            }
            else
            	System.out.print(j);


	}

	System.out.println();

}
	}
}

/*
*****
*****
*****
*****
*****
*/

/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

*/

/*
5432*
543*1
54*21
5*321
*4321
*/