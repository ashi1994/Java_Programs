/*
if(i%5==0) means if a number is multiple of 5 then print Buzz.
if(i%3==0) means if a number is multiple of 3 then print Fizz.
if((i%3==0)&&(i%5==0)) means if a number is multiple of 3 as well as 5, the
*/
package Extra;
public class FizzBuzzProblem
{
    public static void main(String args[])
    {
        for(int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0 && i % 5== 0)
            {
                System.out.println("FizzBuzz");
            }
            else if ((i % 5) == 0)
            {
                System.out.println("Buzz");
              }
            else if ((i % 3) == 0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(i);
              }
        }
    }
}
