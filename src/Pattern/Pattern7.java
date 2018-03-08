package Pattern;
class Pattern7
{
	public static void main(String...s)
	{
      String s1="ALLAHABAD";
      char ch[]=s1.toCharArray();
      for(int i=0;i<ch.length;i++)
     {
     for(int j=0;j<=i;j++)
     {
       System.out.print(ch[j]+" ");
     }
     System.out.println();
     }

 for(int i=0;i<ch.length;i++)
     {
     for(int j=0;j<8-i;j++)//HERE 8-i can change always take le (length-1-i)
     {
       System.out.print(ch[j]+" ");
     }
     System.out.println();
     }

	}}
	/*

A
A L
A L L
A L L A
A L L A H
A L L A H A
A L L A H A B
A L L A H A B A
A L L A H A B A D
A L L A H A B A
A L L A H A B
A L L A H A
A L L A H
A L L A
A L L
A L
*/