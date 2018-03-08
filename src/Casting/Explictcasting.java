//page 90
package Casting;
class Explictcasting
{
	public static void main(String...s)
	{
	  //byte b=130; //incompatible types: possible lossy conversion from int to byte,size is -128 to 127
	  byte b2=(byte)140;
	  System.out.println(b2);//-126
	  byte b1=120;//it run

	  double d=123.567;//when we assign floating data type to integer it losses value after decimal...
	  int a=(int)d;
	  System.out.println(a);//123
	  byte b4=(byte)d;
	  System.out.println(b4);//123
	  short s3=(short)d;
	  System.out.println(s3);//123
         
	}
}