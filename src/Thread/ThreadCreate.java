package Thread;
//by extending thrrad class
class ThreadCreate extends Thread
{ 
	public void run()
	{  
      System.out.println("thread is running...");  
    }  
	public static void main(String args[])
	{  
	
		ThreadCreate t1=new ThreadCreate();  
         t1.start();  
    }  
}

//by runnable interface

/*
class Multi3 implements Runnable{  
public void run()
{  
System.out.println("thread is running...");  
}  
public static void main(String args[])
{  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  


//by annomys class

public class A {
    public static void main(String[] arg)
    {
       new Thread()
        {
            public void run() 
{
                System.out.println("Thread Running");
            }
        }.start();
    }
}
*/