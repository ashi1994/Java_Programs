package Number;

import java.util.Scanner;

public class PrimeNumber {

	 public static void isPrime(int n){
	  int flag=0;
	  if(n==0 || n==1)
	   System.out.println(n+ " not a prime number");
	  else {
	  for(int i=2;i<n;i++){
	   if(n%i==0){
	    flag=1;
	    break;
	   }
	   else
	    flag=0;
	  }
	  if(flag==0)
	   System.out.println(n+ " a prime number");
	  else
	   System.out.println(n+ " not a prime number");
	 }
}
	 
	 public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number ");
	  int n=sc.nextInt();
	  isPrime(n);
	  sc.close();

	 }

	}
