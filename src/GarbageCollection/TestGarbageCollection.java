/**
Whenever you run a java program, JVM creates three threads--main thread,Thread Scheduler,Garbage Collector Thread.
In these three threads, main thread is a user thread and remaining two are daemon threads which run in background.
The task of main thread is to execute the main() method.The task of thread scheduler is to schedule the threads. 
The task of garbage collector thread is to sweep out abandoned objects from the heap memory.
Abandoned objects or dead objects are those objects which does not have live references. 
Garbage collector thread before sweeping out an abandoned object, 
it calls finalize() method of that object. After finalize() method is executed, 
object is destroyed from the memory. T
hat means clean up operations which you have kept in the finalize() method are 
executed before an object is destroyed from the memory
 you can call garbage collector explicitly using System.gc() or RunTime.getRunTime().gc(). Again it is just a request to garbage collector not a command. 
 It is up to garbage collector to honour this request
http://javaconceptoftheday.com/garbage-collection-finalize-method-java/
**/
package GarbageCollection;

public class TestGarbageCollection {
	
	protected void finalize()  {
		System.out.println("Cleaned up resources");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGarbageCollection obj=new TestGarbageCollection();
		obj=null;
		System.gc();
		

	}

}
