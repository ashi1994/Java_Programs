package Exception;

public class ExceptionHandlingWhereSingleLineHaveManyExeption {
	

    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object
 
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);       
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
 
            }
 
            catch(NumberFormatException ex)
            {
                System.out.println("NumberFormatException will be caught here");
            }
 
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            }
 
            catch (NullPointerException ex)
            {
                System.out.println("NullPointerException will be caught here");
            }
 
            /*
             * Using pipe we can catch all the Exception(JAVA 7)
             catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Now, this block handles NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
            }
             * 
             */
            
            System.out.println("After executing respective catch block, this statement will be executed");
        }
    }
}


