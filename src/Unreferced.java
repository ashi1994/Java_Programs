class A 
{

 static A a=null;
 public static void main(String[] args)

  {
   A b=new A();
   System.out.println( b.hashCode() );
    b=new A();
     System.gc(); 
     //System.out.println( a.hashCode());
      }
       public void finalize() 
       { 
      
        a=this;
        System.out.println( a.hashCode() );
         System.out.println("finalize method"); 
         } 
         }