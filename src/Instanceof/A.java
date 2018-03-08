package Instanceof;
class Tree { } 
class Pine extends Tree { } 
class Oak extends Pine { } 
class F extends Tree{ }
class Forest1 
{ 
    public static void main (String [] args)
    { 
        Oak tree = new Oak(); 
        if( tree instanceof Pine) 
            System.out.println ("Pine"); 
    else
    {
        System.out.println ("not Pine");
    }

    } 

}