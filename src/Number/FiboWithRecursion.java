package Number;

import java.util.Scanner;

public class FiboWithRecursion {
	
	public static int fibonacco(int number) {
		if(number==1||number==0)
			//if(number<=1)
			return number;
		return (fibonacco(number-1)+fibonacco(number-2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please input your number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(fibonacco(i)+" ");
		
		

	}

}

//It will give input like 1,1,2,3,5
