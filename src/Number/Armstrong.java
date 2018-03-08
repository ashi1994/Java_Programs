package Number;
//smallest is 153
import java.util.*;

class Armstrong {       
	public static void main(String[] args)    
	{ 
    int c=0,reminder,temp;         
     Scanner sc=new Scanner(System.in);  
     System.out.println("enter the no to check armstrong");  
     int n=sc.nextInt();         
      temp=n;      
      while(n>0)    
        {     
         reminder=n%10;    
           n=n/10;     
            c=c+(reminder*reminder*reminder);      
        }      
        if(temp==c)         
          System.out.println("Armstrong number");       
        else         
          System.out.println("Not Armstrong number"); 
}}