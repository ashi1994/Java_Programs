package Number;
class Numberreverse
  {
    public static void main(String...s)
    {
    int number=123;
    int reverse=0;
      int temp=number;
       while(number>0)
       {
                  int remainder=number%10;
                  number=number/10;
                  reverse=reverse*10+remainder;
      
       } 


       //System.out.println(reverse); 
       
       if(temp==reverse)
       	System.out.println("palindrome");
       else
       	System.out.println("not palindrome");
         
     }
           
           }