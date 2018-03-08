package Number;
import java.math.*;
class Maxeasy
{
	
	public static void main(String...s)
	{

	int a=-5,b=-2;
	float c;
	c=Math.abs((a+b)/2)+Math.abs((a-b)/2);//it will also give max
	double d=(Math.sqrt(a*a+b*b-2*a*b)+a+b)/2;//it can be used for max
	System.out.print(d); 
	}
}