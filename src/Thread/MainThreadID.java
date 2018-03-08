package Thread;
/**
 * Thread ID doesn’t change when the name of a thread is changed
 * Thread ID is a unique positive long number.
 * It remains the same for a thread during its whole life term
 * Thread ID is generated as soon as the thread is created. So, you can use the thread ID before starting the thread.
 * we can change the priority of a main thread
 */

public class MainThreadID {
	
	    public static void main(String[] args)
	    {
	    	//First, get the reference of main thread using currentThread() method of Thread class
	        Thread t = Thread.currentThread();
	 
	        long ID = t.getId();
	        String name=t.getName();
	        int priority=t.getPriority();
	 
	        System.out.println("Id of main Thread "+ID);
	        System.out.println("Name of main thread " +name);
	        System.out.println("Prority of manin thread "+priority);
	    }
	}



