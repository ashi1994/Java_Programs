package Thread;
//What if we call run() method directly instead start() method?
//Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack
//there is no context-switching because here t1 and t2 will be treated as normal object not thread object.
class CallRun extends Thread
{  
 public void run()
 {  
   System.out.println("running...");  
 }  
 public static void main(String args[])
 {  
  CallRun t1=new CallRun();  

  t1.run();//fine, but does not start a separate call stack  
 }  
}  