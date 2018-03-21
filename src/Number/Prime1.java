package Number;
import java.util.Scanner; 
class Prime1 {
	public static void main(String args[])
	{ 
		int n, i, res; 
		boolean flag=false;
		Scanner scan= new Scanner(System.in); 
		System.out.println("Please Enter a No."); 
		n=scan.nextInt(); 
		for(i=2;i<=n/2;i++){
			if(n%i==0)
			{
				flag=true;
				break; 
				
			}
			
		} 
		
    if(!flag)
 System.out.println(n + " is Prime Number");
    else 
 System.out.println(n + " is not Prime Number");
    
	}
}
/**
In the above program, for loop is used to determine if the given number num is prime or not.
We only have to loop through 2 to half of num, because no number is divisible by more than its half.
Inside the for loop, we check if the number is divisible by any number in the given range (2..num/2).
If it is, flag is set to true and we break out of the loop. This determines num is not a prime number.
*/
