package Pattern;
class Pattern4
{
public static void main(String[] args) 
{
 int i, j, k;
for(i=5;i>=1;i--)
{
for(j=5;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
}
}
/*
class Pattern4
{
	public static void main(String[] args)
		{

          for(int i=1;i<=5;i++)
          {
          	for(int j=4;j<i;j++)
          	{

          		System.out.print(" ");

          	}

          	for(int k=1;k<=2*i-1;k++)
          	{
                 System.out.print("*");
          	}

          	     System.out.println();
          }

	}
}
*/
/*

*********
 *******
  *****
   ***
    *


*/    