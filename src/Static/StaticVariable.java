package Static;
/*
 * Static keyword in java is used for memory management mainly
 * The static variable gets memory only once in class area at the time of class loading.
 * The value of a static field is the same across all instances of the class
 * Java static keyword with variables, methods, blocks and nested class.
 */
class StaticVariable
{
	
static int a=12;
int b=12;
void show()
{
  a++;
  b++;
  System.out.println(a);
  System.out.println(b);
}

public static void main(String...s)
{
StaticVariable s1=new StaticVariable();
StaticVariable s2=new StaticVariable();
StaticVariable s3=new StaticVariable();
s1.show();//13,13
s2.show();//14,13
s3.show();//15,13	

}

}
/*
13
13
14
13
15
13
*/