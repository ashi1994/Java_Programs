package Thread;
/**
 * Thread ID is a unique positive long number. It remains the same for a thread during its whole life term.
 * Thread ID is generated as soon as the thread is created. So, you can use the thread ID before starting the thread.
 * Thread ID doesn’t change when the name of a thread is changed.
 *  we can’t assign our own ID to the thread
 */

public class ThreadId extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadId t=new ThreadId();
		ThreadId t1=new ThreadId();
		System.out.println("Thread Id of first thread " +t.getId());
		System.out.println("Thread Id of first thread " +t1.getId());

	}

}
