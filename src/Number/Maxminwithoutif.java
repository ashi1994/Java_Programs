package Number;
class Maxminwithoutif
{
	int min(int x,int y)
	{
       return (x < y) ? x : y;
	  
	}
  
    int max(int x,int y)
    {

    	return (x > y) ? x : y;
    }


  public static void main(String...s)
  {

  	Maxminwithoutif m=new Maxminwithoutif();
  	System.out.println(m.min(5,6));
  	System.out.println(m.max(56,12));
  }

}