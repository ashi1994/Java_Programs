package Thread;
//Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
//Deadlocks can occur in Java when the synchronized keyword causes the executing thread to block
//while waiting to get the lock, associated with the specified object. Since the thread might already hold locks
//associated with other objects, two threads could each be waiting for the other to release a lock. In such case, 
//they will end up waiting forever.
//If we provide order access then no deadlock occurs
class TestDeadlockExample
{  
  public static void main(String[] args)
   {  
    final String resource1 = "ratan jaiswal";  
    final String resource2 = "vimal jaiswal";  
    // t1 tries to lock resource1 then resource2  
    Thread t1 = new Thread() 
    {  
      public void run()
       {  
          synchronized (resource1) 
          {  
           System.out.println("Thread 1: locked resource 1");  
           try
           {
			Thread.sleep(100);
		   } 
           catch (InterruptedException e) 
           {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
  
           synchronized (resource2)
           {  
            System.out.println("Thread 1: locked resource 2");  
           }  
         }  
      }  
    };  
  
    // t2 tries to lock resource2 then resource1  
    Thread t2 = new Thread() {  
    	public void run()
    	{  
    		synchronized (resource1)
    		{  
    			System.out.println("Thread 2: locked resource 2");  
    			try {
    				Thread.sleep(100);
    				}
          catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
          
  
          synchronized (resource2)
           {  
            System.out.println("Thread 2: locked resource 1");  
          }  
        }  
      }  
    };  
  
      
    t1.start();  
    t2.start();  
  }  
} 