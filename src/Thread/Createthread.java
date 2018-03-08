package Thread;
/*
public class Createthread extends Thread{
	public void run()
	{
		System.out.println("thread running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Createthread cr=new Createthread();
		cr.start();
	}

}
*/

class Createthread implements Runnable
{
   public void run()
   {
	   System.out.println("hello runniung");
   }
   
   public static void main(String[] args) 
   {
	   Createthread cq=new Createthread();
	   Thread t1=new Thread(cq);
	   t1.start();
   }

}
