package Pattern;
/*
class Pattern1
{
	public static void main(String...s)
	{
      String s1="12345";
      char ch[]=s1.toCharArray();
      for(int i=0;i<ch.length;i++)
         {
               for(int j=0;j<=i;j++)
            {
                 System.out.print(ch[j]+" ");
             }
       System.out.println();
         }
	}
}
*/
class Pattern1
 {
    public static void main(String[] args)
     {
           //int n=1;
           for (int i = 1; i <= 5; i++)
            {
                  for (int j = 1; j <= i; j++)
                   {
                        System.out.print(j);//n +" ");
                        //n++;
                  }
                  System.out.println();
           }
 
    }
}
//if we put j in first print
/*
1
12
123
1234
12345
*/
//if we put i in first print
/*
1
22
333
4444
55555
*/
//if we put * in first print
/*
*
**
***
****
*****
*/
//if we have print intially take n=1 and increase by n=n+1
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

