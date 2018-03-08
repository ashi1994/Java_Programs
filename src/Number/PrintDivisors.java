package Number;
import java.util.*;
class PrintDivisors
{
    public static void main(String args[])
    {

    System.out.println("Enter the number");

    // Create Scanner object for taking input
    Scanner s=new Scanner(System.in);

    // Read an int
    int n=s.nextInt();
    
        // Loop from 1 to 'n'
        for(int i=1;i<=n;i++)
        {
    
            // If remainder is 0 when 'n' is divided by 'i',
            if(n%i==0)
            {
            System.out.print(i+", ");
            }
        }
    
    // Print [not necessary]    
    System.out.print("are divisors of "+n);
    
    }
}