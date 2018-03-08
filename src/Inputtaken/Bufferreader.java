package Inputtaken;
import java.io.*; 
class UserInput
 {   
 public static void main(String arg[])  
  {      
  InputStreamReader isr=new InputStreamReader(System.in);      
  BufferedReader br=new BufferedReader(isr);      //or      //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));      
  try
  {    
  System.out.println("Enter name");  
      String s=br.readLine();
            System.out.println("Enter age");           
             int a= Integer.parseInt(br.readLine());
            System.out.println("Enter salary");           
             double b= Double.parseDouble(br.readLine());
            System.out.println("name is:"+s);  
              System.out.println("your age:" +a);
               System.out.println("your salary:" +b);

         }
          catch(Exception e)       
            {           
             System.out.println("Error is "+e);            
             e.printStackTrace();        
              } 
                }
                 }