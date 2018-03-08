package Number;
import java.util.Scanner;
  class Fibonacci 
  {
   public static void main(String args[]) 
   {
    int a=0,b=1, c, n;
     Scanner sc=new Scanner(System.in); 
     System.out.println("enter the no. till  where we hava find fibonacci"); 
     n=sc.nextInt();
          
             for(int i=1;i<=n;i++) 
          { 

             System.out.println(a);
             c=a+b;
             a=b;
             b=c;

             }
    }
             
  }