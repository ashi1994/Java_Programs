package Number;
import java.util.*;
class RandomNumbers
{  
public static void main(String[] args) 
{    
int c; 
   Random t = new Random();
 //for single random number
   System.out.println(t.nextInt(100));
    // 10 random integers in [0, 100]
    for (c = 1; c <=10; c++)
     {      
        System.out.println(t.nextInt(100));   
      }

//ArrayList<Integer> act=new ArrayList<>();
//for(int i=1;i<=5;i++)
//	act.add(i);
//Collections.shuffle(act);
//System.out.println(act);

     } 

      }