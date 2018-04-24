package Number;
/*Write a program to check that the entered no is prime or not.*/
import java.util.Scanner;
 class Prime
 {
 public static void main(String...s)
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter a number which you want to check whether it is prime or not");
	int n=sc.nextInt();
    int i,flag=0;
    sc.close();
if(n==0||n==1)
	System.out.println("This is not a prime number");
else {
 for(i=2;i<=n/2;i++)
  {
      if(n%i==0)
      {
          flag=1;
          break;
      }
  }

  if (flag==0)
  
      System.out.println("prime number");
    
  else
      System.out.println("This is not a prime number");
      
}

}
}