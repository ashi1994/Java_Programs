package Static;
/*
 * Static keyword in java is used for memory management mainly
 * The static variable gets memory only once in class area at the time of class loading.
 * The value of a static field is the same across all instances of the class
 * Java static keyword with variables, methods, blocks and nested class.
 * Static variable has one copy of for all object in class but in case of non static variable there is own copy for each object
 */
class StaticVariable
{
	
static int a=12;//Static variable
int b=12;//non static variable(instance varaible)
void show()
{
  a++;
  b++;
  System.out.println(a);
  System.out.println(b);
}

void print(){
	int c=10;//Local variable
	System.out.println(c);
}

public static void main(String...s)
{
StaticVariable s1=new StaticVariable();
StaticVariable s2=new StaticVariable();
StaticVariable s3=new StaticVariable();
s1.show();//13,13
s2.show();//14,13
s3.show();//15,13	

System.out.println("Static varibale can be access by Using class name " +a);

}

}