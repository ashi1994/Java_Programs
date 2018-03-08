package Number;
class Maxwithoutif
{
	void max(int x,int y)
	{
	  int z=x-y;
	  int i=(z>>31) & 0x1;
	  int max=x-i*z;
	  System.out.print(max);
	}
public static void main(String...s)
{
	
	Maxwithoutif m=new Maxwithoutif();
	m.max(5,15);
	
}
}