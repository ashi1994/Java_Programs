/*
 * Using super keyword we can access method,constructer and variable of Super class in sub-class.
 * super is not used with static.
 */

package Super;
class A{
	int a=10;
}
class B extends A{
	int a=23;

	void display(){
		System.out.println(super.a);//IT WILL PRINT 23 BY DEFAULT BUT IF WE USE SUPER THEN CAN PRINT 10 OF PARENT CLASS
    }
	public static void main(String...s)
	{
		B b=new B();
		b.display();
		}

}	




