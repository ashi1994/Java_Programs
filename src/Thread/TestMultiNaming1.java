package Thread;
//public String getName(): is used to return the name of a thread.
//public void setName(String name): is used to change the name of a thread.


class TestMultiNaming1 extends Thread
{  
  public void run()
  {  
   System.out.println("running...");  
  }  
 public static void main(String args[])
 {  
  TestMultiNaming1 t1=new TestMultiNaming1();  
  TestMultiNaming1 t2=new TestMultiNaming1(); 

  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
//  t1.start();  
//  t2.start();  
  
 t1.setName("ASHIWANI");
 t2.setName("MITHU");  
 System.out.println("After changing name of t1:"+t1.getName());  
 System.out.println("After changing name of t2:"+t2.getName());  
 }  
} 
