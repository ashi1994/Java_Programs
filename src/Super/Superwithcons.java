package Super;
class C
{
	C()
	{
	System.out.println("papa ka constructer chal raha hai");
	}

}

class D extends C
{
	D()// super add by default in constructer
	{
		
      System.out.println("beta ka constructer chal raha hai");

	}
      
public static void main(String...s)
{
	
  D d=new D();

}


}

