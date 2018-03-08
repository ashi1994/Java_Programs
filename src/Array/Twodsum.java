package Array;
class Twodsum
{
	public static void main(String...s)
	{
	  int a[][]={{2,31,34},{1,21,4}};
	  int b[][]={{12,311,34},{11,211,40}};

	  int[][] c=new int[2][3];
	  for(int i=0;i<2;i++)
	  { 
	    for(int j=0;j<3;j++)
	    {
	      c[i][j]=a[i][j]*b[i][j];
	      System.out.print(c[i][j]+" ");  
      }  
        System.out.println();//new line  
        } 


	    
	}
}