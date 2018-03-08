//Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).arihmatic,null pointer,array out of bound
//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
// also called as chained exception
package Exception;
class TestExceptionPropagation
{  
  void m()
  {  
    int data=50/0;  
  }  
  void n()
  {  
    m();  
  }  
  void p()
  {  
   try
   {  
    n();  
   }
   catch(Exception e)
   {
   System.out.println("exception handled");
   }  
  }  
  public static void main(String args[])
  {  
   TestExceptionPropagation obj=new TestExceptionPropagation();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
} 