package Collection;
import java.util.*;
public class TestVector 
{
  public static void main(String[] args) 
   {
      Vector<Integer> ve = new Vector<Integer>();
      System.out.println("intial size  "+ve.capacity());//Initial capacity: 10
       ve.addElement(10);//any one can used add() or addElement()
       ve.add(20);
       ve.add(30);
       ve.add(40);
       ve.add(50);
       ve.add(60);
       for(int i=1;i<=10;i++)
        ve.add(i);
       System.out.println(ve);
       System.out.println("after size  "+ve.capacity());//Here 15 element now so size is Double i.e 20
       Enumeration<Integer> en = ve.elements();
       
       while(en.hasMoreElements())
       {
           System.out.println(en.nextElement());
       }
   }
    
}