package Number;
class PalindromeNumber
  {
    public static void main(String...s)
    {
    int number=12333231;
    int reverse=0;
    int remainder;
      int temp=number;
       while(number>0)
       {
                  remainder=number%10;
                  number=number/10;
                  reverse=reverse*10+remainder;
       } 
       if(temp==reverse)
       	System.out.println("palindrome");
       else
       	System.out.println("not palindrome");
         
     }
           
           }