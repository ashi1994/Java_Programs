package Pattern;
import java.util.Scanner; //Scanner Class
public class PatternHollowDiamond 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of n");
        int N = sc.nextInt(); //Getting N Value from User
        int i,j,k;
        if(N>1 && N<=20) //Constraint Not Necessary
        {
            for(i=1;i<=N;i++) //Running the Loop for N times
            {
                for(j=i;j<=N;j++)
                {
                    System.out.print(" "); //Printing Required Spaces
                }
                for(k=1;k<=(i*2)-1;k++) //Printing the *
                {
                    if(k>1 && k<(i*2)-1) 
                    {
                        System.out.print(" "); //for k>1 and k<(i*2)-1 printing spaces
                    }
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
            for(i=N-1;i>=1;i--) //Same but just the inverted triangle
            {
                for(j=i;j<=N;j++)
                {
                    System.out.print(" ");
                }
                for(k=(i*2)-1;k>=1;k--)
                {
                    if(k<(i*2)-1 && k>1)
                    {
                        System.out.print(" ");
                    }
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
        }
 }  }