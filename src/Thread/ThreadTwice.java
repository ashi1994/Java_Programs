package Thread;
//NEVER WE START THREAD TWICE ,IT GIVE ERROR

public class ThreadTwice extends Thread
{  
 public void run()
{  
   System.out.println("running...");  
 }  
   
 public static void main(String args[])
{  
  ThreadTwice t1=new ThreadTwice(); 
   t1.start(); //IllegalThreadStateException throws at run time
   t1.start();

 }  
}