package Interface_abstract;

abstract class Bike
{  
   Bike()//constructer in abstract class
     {
   System.out.println("bike is created");
      }  

   abstract void run();//abstract method  

     void changeGear()//normal method
      {
         System.out.println("gear changed");}  
      }  
  
 class Honda extends Bike
    {  
 void run()
 {
   System.out.println("running safely..");
 }  
    }  
 class TestAbstraction2
   {  
 public static void main(String args[])
     {  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
   }  
}  