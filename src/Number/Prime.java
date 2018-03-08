package Number;
/*Write a program to check that the entered no is prime or not.*/
import java.util.Scanner;
 class Prime
 {
 public static void main(String...s)
 {
	
   int i,flag=0;
   int n=6;

 for(i=2;i<=n/2;i++)
  {
      if(n%i==0)
      {
          flag=1;
          break;
      }
  }

  if (flag==0)
  
      System.out.println("prime");
    
  else
      System.out.println("This is not a prime number");
      


}
}